package lib;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Poi2 {
    //rowspan 하는 방법
    public static String filePath = "C:\\poi_temp";
    public static String fileNm = "poi_making_file_test"+Math.random()+".xlsx";

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "FORD", "ANALYST", "7566", "1997-12-05", "3000.00", ""));
        employees.add(new Employee("2", "MARTIN", "SALESMAN1,SALESMAN2,SALESMAN3,SALESMAN4,SALESMAN5", "7698", "1998-12-05", "1250.00", "1400.00"));
        employees.add(new Employee("3", "FORD", "ANALYST", "7566", "1997-12-05", "3000.00", ""));
        employees.add(new Employee("4", "FORD", "ANALYST", "7566", "1997-12-05", "3000.00", ""));
        employees.add(new Employee("5", "MARTIN", "SALESMAN1,SALESMAN2", "7698", "1998-12-05", "1250.00", "1400.00"));
        employees.add(new Employee("6", "MARTIN", "SALESMAN1,SALESMAN2,SALESMAN3,SALESMAN4", "7698", "1998-12-05", "1250.00", "1400.00"));
        employees.add(new Employee("7", "FORD", "ANALYST", "7566", "1997-12-05", "3000.00", ""));
        employees.add(new Employee("8", "FORD", "ANALYST", "7566", "1997-12-05", "3000.00", ""));
        employees.add(new Employee("9", "FORD", "ANALYST", "7566", "1997-12-05", "3000.00", ""));

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("설문결과");
        String[] header={
                "EMPNO"
                ,"ENAME"
                ,"JOB"
                ,"MGR"
                ,"HIREDATE"
                ,"SAL"
                ,"COMM"
        };
        //header
        XSSFRow headerRow =sheet.createRow(0);
        for(int c=0; c<header.length; c++){
            Cell headerCell = headerRow.createCell(c);
            headerCell.setCellValue(header[c]);
        }

        int rowCnt = 0;
        XSSFRow row = null;
        for(int r=0; r<employees.size(); r++){
            row =sheet.createRow(rowCnt+1);
            Employee emp = employees.get(r);

            Cell empno = row.createCell(0);
            Cell ename = row.createCell(1);
            Cell job = row.createCell(2);
            Cell mgr = row.createCell(3);
            Cell hiredate = row.createCell(4);
            Cell sal = row.createCell(5);
            Cell comm = row.createCell(6);

            empno.setCellValue(emp.getEmpno());
            ename.setCellValue(emp.getEname());
            job.setCellValue(emp.getJob());
            mgr.setCellValue(emp.getMgr());
            hiredate.setCellValue(emp.getHiredate());
            sal.setCellValue(emp.getSal());
            comm.setCellValue(emp.getComm());

            String jobIsArray = job.toString();
            String[] jobArray = jobIsArray.split(",");
            int len = jobArray.length;

            if(len >1 && jobIsArray.contains(",")){

                for(int cc=0; cc<header.length; cc++){
                    int max=0;
                    if(cc>=2){
                        int rowSpan=rowCnt;
                        rowSpan++;

                        for(int a=0; a<len; a++){
                            max = Integer.max(0,row.getRowNum());
                            if(a==0){
                                job.setCellValue(jobArray[a]);
                            }else{
                                rowSpan++;

                                row = sheet.createRow(rowSpan);
                                Cell newCell = row.createCell(2);
                                newCell.setCellValue(jobArray[a]);

                                int startRow = row.getRowNum()-1;

                                if(cc >2){
                                    sheet.addMergedRegion(new CellRangeAddress(startRow,max,cc,cc));
                                }
                            }
                        }

                    }else{
                        int startRow = row.getRowNum();
                        sheet.addMergedRegion(new CellRangeAddress(startRow,startRow+(len-1),cc,cc));

                    }
                }

            }
            rowCnt++;
            rowCnt+=(len-1);
        }

        try {
            FileOutputStream out = new FileOutputStream(new File(filePath, fileNm));
            workbook.write(out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    private String empno;
    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private String sal;
    private String comm;
    private String deptno;

    public Employee(String empno, String ename, String job, String mgr, String hiredate, String sal, String comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    // Getter 메서드
    public String getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public String getMgr() {
        return mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public String getSal() {
        return sal;
    }

    public String getComm() {
        return comm;
    }

    public String getDeptno() {
        return deptno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno='" + empno + '\'' +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr='" + mgr + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", sal='" + sal + '\'' +
                ", comm='" + comm + '\'' +
                ", deptno='" + deptno + '\'' +
                '}';
    }
}

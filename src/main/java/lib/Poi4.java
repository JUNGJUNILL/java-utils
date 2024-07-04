package lib;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Poi4 {

    public static String filePath = "C:\\poi_temp";
    public static String fileNm = "poi_making_file_test"+Math.random()+".xlsx";
    public static void main(String[] args) {

        List<Employee3> employees = new ArrayList<>();
        // 데이터 추가
        employees.add(new Employee3("7369", "SMITH", "CLERK", "7902", "1993-06-13", "800.00", "0.00", "20"));
        employees.add(new Employee3("7499", "ALLEN", "SALESMAN", "7698", "1998-08-15", "1600.00", "300.00", "30"));
        employees.add(new Employee3("7521", "WARD", "SALESMAN", "7698", "1996-03-26", "1250.00", "500.00", "30"));
        employees.add(new Employee3("7566", "JONES", "MANAGER", "7839", "1995-10-31", "2975.00", "", "20"));
        employees.add(new Employee3("7698", "BLAKE", "MANAGER", "7839", "1992-06-11", "2850.00", "", "30"));
        employees.add(new Employee3("7782", "CLARK", "MANAGER", "7839", "1993-05-14", "2450.00", "", "10"));
        employees.add(new Employee3("7788", "SCOTT", "ANALYST", "7566", "1996-03-05", "3000.00", "", "20"));
        employees.add(new Employee3("7839", "KING", "PRESIDENT", "", "1990-06-09", "5000.00", "0.00", "10"));
        employees.add(new Employee3("7844", "TURNER", "SALESMAN", "7698", "1995-06-04", "1500.00", "0.00", "30"));
        employees.add(new Employee3("7876", "ADAMS", "CLERK", "7788", "1999-06-04", "1100.00", "", "20"));
        employees.add(new Employee3("7900", "JAMES", "CLERK", "7698", "2000-06-23", "950.00", "", "30"));
        employees.add(new Employee3("7934", "MILLER", "CLERK", "7782", "2000-01-21", "1300.00", "", "10"));
        employees.add(new Employee3("7902", "FORD", "ANALYST", "7566", "1997-12-05", "3000.00", "", "20"));
        employees.add(new Employee3("7654", "MARTIN", "SALESMAN", "7698", "1998-12-05", "1250.00", "1400.00", "30"));

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("설문결과");

        for(int r=0; r<employees.size(); r++){
            XSSFRow row =sheet.createRow(r);
            Employee3 emp = employees.get(r);

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

        }
        XSSFSheet sheet2 = workbook.createSheet("설문결과2");

        for(int r=0; r<employees.size(); r++){
            XSSFRow row =sheet2.createRow(r);
            Employee3 emp = employees.get(r);

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

class Employee3 {
    private String empno;
    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private String sal;
    private String comm;
    private String deptno;

    public Employee3(String empno, String ename, String job, String mgr, String hiredate, String sal, String comm, String deptno) {
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
        return "Employee3{" +
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

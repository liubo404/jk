import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.google.common.collect.Lists;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class EasyPoiImport {

    public static void main(String[] args) throws IOException {
//        ImportParams params = new ImportParams();
//        params.setTitleRows(2);
//        params.setHeadRows(2);
//        //params.setSheetNum(9);
//        params.setNeedSave(true);
//        long start = new Date().getTime();
//        List<CourseEntity> list = ExcelImportUtil.importExcel(new File("/home/ben/doc/0382.xls"), CourseEntity.class, params);
//
//        ImportParams params = new ImportParams();
//        params.setHeadRows(2);
//        params.setTitleRows(2);
//        List<CourseEntity> list = ExcelImportUtil.importExcel(new File("/home/ben/doc/0382.xls"), CourseEntity.class, params);

        ImportParams params = new ImportParams();
        params.setHeadRows(1);
        params.setNeedSave(true);
        params.setTitleRows(1);
//        params.setSaveUrl("/home/ben/pic/");
        List<Course> list = ExcelImportUtil.importExcel(new File( "/home/ben/doc/课程.xls"), Course.class, params);


        list.forEach(System.out::println);


        List<CourseEntity> courseList = Lists.newArrayList();
        CourseEntity ce = new CourseEntity();
        ce.setName("course name");
        TeacherEntity math = new TeacherEntity();
        math.setName("mathTeacher");
        TeacherEntity major = new TeacherEntity();
        major.setName("major");

        List<StudentEntity> studentEntities = Lists.newArrayList();
        StudentEntity se = new StudentEntity();
        se.setName("s1");
        se.setBirthday(new Date());
        se.setRegistrationDate(new Date());
        se.setSex(1);
        StudentEntity   se2 = new StudentEntity();
        se2.setName("s2");
        se2.setBirthday(new Date());
        se2.setRegistrationDate(new Date());
        se2.setSex(1);
        studentEntities.add(se2);

        ce.setChineseTeacher(major);
        ce.setMathTeacher(math);
        ce.setStudents(studentEntities);

        courseList.add(ce);
//        courseList.addAll(list);
        List<TeacherEntity> telist = Lists.newArrayList();
        telist.add(major);
        telist.add(math);

//        ExportParams params = new ExportParams("2412312", "测试", "测试");
//        params.setAddIndex(true);
//         Workbook workbook = ExcelExportUtil.exportExcel(params,
//                TeacherEntity.class, telist);

        //
        Course c = new Course();
        c.setCourseName("courseName");
        c.setCurrentPrice(BigDecimal.TEN);
        c.setIsavaliable(1);
        c.setAddTime(new Date());
        c.setSourcePrice(BigDecimal.TEN);
        c.setTitle("课程简介xxxxxxxxxx");
        c.setContext("课程详情sdfsdfsdf");
        c.setEndTime(new Date());
        c.setTeacherName("老师1");
        c.setSubjectName("math");
        c.setLogo("upload/Course/pic31348815453.PNG");
        c.setLessionNum(10);
        List<Course> courses = Lists.newArrayList();
        courses.add(c);
        courses.add(c);
        courses.add(c);

        ExportParams exportParams = new ExportParams("课程表", "课程表");

        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, Course.class,courses);
        FileOutputStream fos = new FileOutputStream("/home/ben/doc/课程.xls");
        workbook.write(fos);
        fos.close();

//        ExportParams exportParams = new ExportParams("0328课程表", "日期：2016-03-28", "六年一班");
//        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, CourseEntity.class,courseList);
//        FileOutputStream fos = new FileOutputStream("/home/ben/doc/0328课程表.xls");
//        workbook.write(fos);
//        fos.close();
    }
}

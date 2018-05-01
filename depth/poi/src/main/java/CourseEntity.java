import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.util.List;

@ExcelTarget("courseEntity")
public class CourseEntity implements java.io.Serializable {

    /** 主键 */
    private String        id;
    /** 课程名称 */
    @Excel(name = "课程名称", orderNum = "1", width = 25,needMerge = true)
    private String        name;
    /** 老师主键 */
    //@ExcelEntity(id = "major")
    private TeacherEntity chineseTeacher;
    /** 老师主键 */
//    @ExcelEntity(id = "absent")
    private TeacherEntity mathTeacher;

    @ExcelCollection(name = "学生", orderNum = "4")
    private List<StudentEntity> students;


    @Override
    public String toString() {
        return "CourseEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chineseTeacher=" + chineseTeacher +
                ", mathTeacher=" + mathTeacher +
                ", students=" + students +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeacherEntity getChineseTeacher() {
        return chineseTeacher;
    }

    public void setChineseTeacher(TeacherEntity chineseTeacher) {
        this.chineseTeacher = chineseTeacher;
    }

    public TeacherEntity getMathTeacher() {
        return mathTeacher;
    }

    public void setMathTeacher(TeacherEntity mathTeacher) {
        this.mathTeacher = mathTeacher;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}

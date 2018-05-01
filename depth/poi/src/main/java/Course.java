import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Course implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int courseId;
    @Excel(name = "课程名称",  width = 25 )
    private String courseName;//课程名称
    @Excel(name = "状态", replace = {"正常_1", "下架_2", "删除_3"},  isImportField = "true_st")
    private int isavaliable;//1 正常　２　下架   3删除
    private int subjectId;//课程专业ID
    private String subjectLink;//课程专业链
    @Excel(name = "专业")
    private String subjectName;//专业名称

    private Date addTime;//课程添加时间
    @Excel(name = "原价")
    private java.math.BigDecimal sourcePrice;//课程原价格（只显示）
    @Excel(name = "优惠价")
    private java.math.BigDecimal currentPrice;//课程销售价格（实际支付价格）设置为0则可免费观看

    @Excel(name = "课时")
    private int lessionNum;//课时
    @Excel(name = "课程图片", type = 2 ,width = 40 , height = 20,imageType = 1)
    private String logo;//课程图片
    private Date updateTime;
    private int pageBuycount;//销售数量
    private int pageViewcount;//浏览数量
    @Excel(name = "结束时间", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd HH:mm:ss", isImportField = "true_st", width = 20)
    private Date endTime;//有效结束时间
    private int loseType;//有效期类型，0：到期时间，1：按天数
    private String loseTime;//有效期:商品订单过期时间点
    
    private String studyPercent;//课程学习进度百分比
    
    private int lessionTotalNum;//课程从属的二级视频节点的 总数

    @Excel(name = "课程简介")
    private String title;//课程简介

    @Excel(name = "课程详情")
    private String context;//课程详情

    @Excel(name = "老师")
    private String teacherName;//老师


    /**评论数*/
    private int commentNum;
}

package com.examInfo.model;

// default package



/**
 * ExamDetail entity. @author MyEclipse Persistence Tools
 */

public class ExamDetail  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer examinfoid;
     private String detail;
     private String img;


    // Constructors

    /** default constructor */
    public ExamDetail() {
    }

	/** minimal constructor */
    public ExamDetail(Integer id, Integer examinfoid) {
        this.id = id;
        this.examinfoid = examinfoid;
    }
    
    /** full constructor */
    public ExamDetail(Integer id, Integer examinfoid, String detail, String img) {
        this.id = id;
        this.examinfoid = examinfoid;
        this.detail = detail;
        this.img = img;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExaminfoid() {
        return this.examinfoid;
    }
    
    public void setExaminfoid(Integer examinfoid) {
        this.examinfoid = examinfoid;
    }

    public String getDetail() {
        return this.detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImg() {
        return this.img;
    }
    
    public void setImg(String img) {
        this.img = img;
    }
   








}
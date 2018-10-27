/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class StudentInfo
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1464138274256979732L;
/*  11:    */   @ApiField("city_no")
/*  12:    */   private String cityNo;
/*  13:    */   @ApiField("class_name")
/*  14:    */   private String className;
/*  15:    */   @ApiField("college_name")
/*  16:    */   private String collegeName;
/*  17:    */   @ApiField("college_no")
/*  18:    */   private String collegeNo;
/*  19:    */   @ApiField("degree")
/*  20:    */   private String degree;
/*  21:    */   @ApiField("departments")
/*  22:    */   private String departments;
/*  23:    */   @ApiField("gmt_enrollment")
/*  24:    */   private Date gmtEnrollment;
/*  25:    */   @ApiField("gmt_graduation")
/*  26:    */   private Date gmtGraduation;
/*  27:    */   @ApiField("major")
/*  28:    */   private String major;
/*  29:    */   @ApiField("student_id")
/*  30:    */   private String studentId;
/*  31:    */   
/*  32:    */   public String getCityNo()
/*  33:    */   {
/*  34: 79 */     return this.cityNo;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setCityNo(String cityNo)
/*  38:    */   {
/*  39: 82 */     this.cityNo = cityNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getClassName()
/*  43:    */   {
/*  44: 86 */     return this.className;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setClassName(String className)
/*  48:    */   {
/*  49: 89 */     this.className = className;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getCollegeName()
/*  53:    */   {
/*  54: 93 */     return this.collegeName;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setCollegeName(String collegeName)
/*  58:    */   {
/*  59: 96 */     this.collegeName = collegeName;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getCollegeNo()
/*  63:    */   {
/*  64:100 */     return this.collegeNo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setCollegeNo(String collegeNo)
/*  68:    */   {
/*  69:103 */     this.collegeNo = collegeNo;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getDegree()
/*  73:    */   {
/*  74:107 */     return this.degree;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setDegree(String degree)
/*  78:    */   {
/*  79:110 */     this.degree = degree;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getDepartments()
/*  83:    */   {
/*  84:114 */     return this.departments;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setDepartments(String departments)
/*  88:    */   {
/*  89:117 */     this.departments = departments;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public Date getGmtEnrollment()
/*  93:    */   {
/*  94:121 */     return this.gmtEnrollment;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setGmtEnrollment(Date gmtEnrollment)
/*  98:    */   {
/*  99:124 */     this.gmtEnrollment = gmtEnrollment;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public Date getGmtGraduation()
/* 103:    */   {
/* 104:128 */     return this.gmtGraduation;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setGmtGraduation(Date gmtGraduation)
/* 108:    */   {
/* 109:131 */     this.gmtGraduation = gmtGraduation;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getMajor()
/* 113:    */   {
/* 114:135 */     return this.major;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setMajor(String major)
/* 118:    */   {
/* 119:138 */     this.major = major;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getStudentId()
/* 123:    */   {
/* 124:142 */     return this.studentId;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setStudentId(String studentId)
/* 128:    */   {
/* 129:145 */     this.studentId = studentId;
/* 130:    */   }
/* 131:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.StudentInfo
 * JD-Core Version:    0.7.0.1
 */
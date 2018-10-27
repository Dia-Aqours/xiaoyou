/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class EduStudentInfoShareResult
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5864445626815262716L;
/* 12:   */   @ApiField("biz_type")
/* 13:   */   private String bizType;
/* 14:   */   @ApiListField("student_infos")
/* 15:   */   @ApiField("student_info")
/* 16:   */   private List<StudentInfo> studentInfos;
/* 17:   */   @ApiField("user_id")
/* 18:   */   private String userId;
/* 19:   */   
/* 20:   */   public String getBizType()
/* 21:   */   {
/* 22:39 */     return this.bizType;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setBizType(String bizType)
/* 26:   */   {
/* 27:42 */     this.bizType = bizType;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public List<StudentInfo> getStudentInfos()
/* 31:   */   {
/* 32:46 */     return this.studentInfos;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setStudentInfos(List<StudentInfo> studentInfos)
/* 36:   */   {
/* 37:49 */     this.studentInfos = studentInfos;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getUserId()
/* 41:   */   {
/* 42:53 */     return this.userId;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setUserId(String userId)
/* 46:   */   {
/* 47:56 */     this.userId = userId;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.EduStudentInfoShareResult
 * JD-Core Version:    0.7.0.1
 */
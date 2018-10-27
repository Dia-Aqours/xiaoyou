/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.EduStudentInfoShareResult;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;

/*  6:   */
/*  7:   */ public class AlipayCommerceEducateStudentinfoShareResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5634752885836818259L;
/* 11:   */   @ApiField("student_info_share_result")
/* 12:   */   private EduStudentInfoShareResult studentInfoShareResult;
/* 13:   */   
/* 14:   */   public void setStudentInfoShareResult(EduStudentInfoShareResult studentInfoShareResult)
/* 15:   */   {
/* 16:25 */     this.studentInfoShareResult = studentInfoShareResult;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public EduStudentInfoShareResult getStudentInfoShareResult()
/* 20:   */   {
/* 21:28 */     return this.studentInfoShareResult;
/* 22:   */   }
/* 23:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayCommerceEducateStudentinfoShareResponse

 * JD-Core Version:    0.7.0.1

 */
/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class ClaimProgress
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 2237521621766327356L;
/* 11:   */   @ApiField("update_content")
/* 12:   */   private String updateContent;
/* 13:   */   @ApiField("update_time")
/* 14:   */   private Date updateTime;
/* 15:   */   
/* 16:   */   public String getUpdateContent()
/* 17:   */   {
/* 18:31 */     return this.updateContent;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setUpdateContent(String updateContent)
/* 22:   */   {
/* 23:34 */     this.updateContent = updateContent;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public Date getUpdateTime()
/* 27:   */   {
/* 28:38 */     return this.updateTime;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setUpdateTime(Date updateTime)
/* 32:   */   {
/* 33:41 */     this.updateTime = updateTime;
/* 34:   */   }
/* 35:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ClaimProgress
 * JD-Core Version:    0.7.0.1
 */
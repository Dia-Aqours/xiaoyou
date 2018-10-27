/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class VoucherTermInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3224225954122993992L;
/* 12:   */   @ApiListField("descriptions")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> descriptions;
/* 15:   */   @ApiField("title")
/* 16:   */   private String title;
/* 17:   */   
/* 18:   */   public List<String> getDescriptions()
/* 19:   */   {
/* 20:33 */     return this.descriptions;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setDescriptions(List<String> descriptions)
/* 24:   */   {
/* 25:36 */     this.descriptions = descriptions;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getTitle()
/* 29:   */   {
/* 30:40 */     return this.title;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setTitle(String title)
/* 34:   */   {
/* 35:43 */     this.title = title;
/* 36:   */   }
/* 37:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.VoucherTermInfo

 * JD-Core Version:    0.7.0.1

 */
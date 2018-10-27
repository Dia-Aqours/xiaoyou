/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiItemExtitemExistedQueryModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6265264898614991939L;
/* 12:   */   @ApiListField("code_list")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> codeList;
/* 15:   */   
/* 16:   */   public List<String> getCodeList()
/* 17:   */   {
/* 18:27 */     return this.codeList;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setCodeList(List<String> codeList)
/* 22:   */   {
/* 23:30 */     this.codeList = codeList;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiItemExtitemExistedQueryModel
 * JD-Core Version:    0.7.0.1
 */
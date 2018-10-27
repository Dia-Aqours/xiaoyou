/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class ArrangementNoQuerier
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4526236643364524448L;
/* 12:   */   @ApiListField("ar_nos")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> arNos;
/* 15:   */   
/* 16:   */   public List<String> getArNos()
/* 17:   */   {
/* 18:27 */     return this.arNos;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setArNos(List<String> arNos)
/* 22:   */   {
/* 23:30 */     this.arNos = arNos;
/* 24:   */   }
/* 25:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ArrangementNoQuerier

 * JD-Core Version:    0.7.0.1

 */
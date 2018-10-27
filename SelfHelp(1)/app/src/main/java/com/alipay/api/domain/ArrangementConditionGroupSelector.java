/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ArrangementConditionGroupSelector
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1254199118842298756L;
/* 10:   */   @ApiField("select_latest_pd_cd")
/* 11:   */   private Boolean selectLatestPdCd;
/* 12:   */   
/* 13:   */   public Boolean getSelectLatestPdCd()
/* 14:   */   {
/* 15:23 */     return this.selectLatestPdCd;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setSelectLatestPdCd(Boolean selectLatestPdCd)
/* 19:   */   {
/* 20:26 */     this.selectLatestPdCd = selectLatestPdCd;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ArrangementConditionGroupSelector
 * JD-Core Version:    0.7.0.1
 */
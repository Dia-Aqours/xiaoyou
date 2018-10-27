/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingToolPointsUpdateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6521672485886415967L;
/* 10:   */   @ApiField("point_log_no")
/* 11:   */   private String pointLogNo;
/* 12:   */   
/* 13:   */   public void setPointLogNo(String pointLogNo)
/* 14:   */   {
/* 15:24 */     this.pointLogNo = pointLogNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getPointLogNo()
/* 19:   */   {
/* 20:27 */     return this.pointLogNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingToolPointsUpdateResponse
 * JD-Core Version:    0.7.0.1
 */
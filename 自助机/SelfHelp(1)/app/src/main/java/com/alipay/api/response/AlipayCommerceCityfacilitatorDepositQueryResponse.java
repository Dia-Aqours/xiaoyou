/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.RechargeBill;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;

/*  8:   */
/*  9:   */ public class AlipayCommerceCityfacilitatorDepositQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4656761497574299646L;
/* 13:   */   @ApiListField("recharge_bills")
/* 14:   */   @ApiField("recharge_bill")
/* 15:   */   private List<RechargeBill> rechargeBills;
/* 16:   */   
/* 17:   */   public void setRechargeBills(List<RechargeBill> rechargeBills)
/* 18:   */   {
/* 19:28 */     this.rechargeBills = rechargeBills;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<RechargeBill> getRechargeBills()
/* 23:   */   {
/* 24:31 */     return this.rechargeBills;
/* 25:   */   }
/* 26:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayCommerceCityfacilitatorDepositQueryResponse

 * JD-Core Version:    0.7.0.1

 */
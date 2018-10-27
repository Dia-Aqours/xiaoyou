/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayAccountExratePricingNotifyModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3289224148986572263L;
/* 12:   */   @ApiField("client_id")
/* 13:   */   private String clientId;
/* 14:   */   @ApiField("inst")
/* 15:   */   private String inst;
/* 16:   */   @ApiListField("pricing_list")
/* 17:   */   @ApiField("pricing_v_o")
/* 18:   */   private List<PricingVO> pricingList;
/* 19:   */   @ApiField("segment_id")
/* 20:   */   private String segmentId;
/* 21:   */   @ApiField("time_zone")
/* 22:   */   private String timeZone;
/* 23:   */   
/* 24:   */   public String getClientId()
/* 25:   */   {
/* 26:52 */     return this.clientId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setClientId(String clientId)
/* 30:   */   {
/* 31:55 */     this.clientId = clientId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getInst()
/* 35:   */   {
/* 36:59 */     return this.inst;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setInst(String inst)
/* 40:   */   {
/* 41:62 */     this.inst = inst;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public List<PricingVO> getPricingList()
/* 45:   */   {
/* 46:66 */     return this.pricingList;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setPricingList(List<PricingVO> pricingList)
/* 50:   */   {
/* 51:69 */     this.pricingList = pricingList;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getSegmentId()
/* 55:   */   {
/* 56:73 */     return this.segmentId;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setSegmentId(String segmentId)
/* 60:   */   {
/* 61:76 */     this.segmentId = segmentId;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getTimeZone()
/* 65:   */   {
/* 66:80 */     return this.timeZone;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setTimeZone(String timeZone)
/* 70:   */   {
/* 71:83 */     this.timeZone = timeZone;
/* 72:   */   }
/* 73:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayAccountExratePricingNotifyModel
 * JD-Core Version:    0.7.0.1
 */
/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AlipayAssetPointOrderCreateModel
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 6448322674561423693L;
/* 11:   */   @ApiField("memo")
/* 12:   */   private String memo;
/* 13:   */   @ApiField("merchant_order_no")
/* 14:   */   private String merchantOrderNo;
/* 15:   */   @ApiField("order_time")
/* 16:   */   private Date orderTime;
/* 17:   */   @ApiField("point_count")
/* 18:   */   private Long pointCount;
/* 19:   */   @ApiField("user_symbol")
/* 20:   */   private String userSymbol;
/* 21:   */   @ApiField("user_symbol_type")
/* 22:   */   private String userSymbolType;
/* 23:   */   
/* 24:   */   public String getMemo()
/* 25:   */   {
/* 26:58 */     return this.memo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setMemo(String memo)
/* 30:   */   {
/* 31:61 */     this.memo = memo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getMerchantOrderNo()
/* 35:   */   {
/* 36:65 */     return this.merchantOrderNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setMerchantOrderNo(String merchantOrderNo)
/* 40:   */   {
/* 41:68 */     this.merchantOrderNo = merchantOrderNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public Date getOrderTime()
/* 45:   */   {
/* 46:72 */     return this.orderTime;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setOrderTime(Date orderTime)
/* 50:   */   {
/* 51:75 */     this.orderTime = orderTime;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Long getPointCount()
/* 55:   */   {
/* 56:79 */     return this.pointCount;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setPointCount(Long pointCount)
/* 60:   */   {
/* 61:82 */     this.pointCount = pointCount;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getUserSymbol()
/* 65:   */   {
/* 66:86 */     return this.userSymbol;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setUserSymbol(String userSymbol)
/* 70:   */   {
/* 71:89 */     this.userSymbol = userSymbol;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public String getUserSymbolType()
/* 75:   */   {
/* 76:93 */     return this.userSymbolType;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void setUserSymbolType(String userSymbolType)
/* 80:   */   {
/* 81:96 */     this.userSymbolType = userSymbolType;
/* 82:   */   }
/* 83:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayAssetPointOrderCreateModel
 * JD-Core Version:    0.7.0.1
 */
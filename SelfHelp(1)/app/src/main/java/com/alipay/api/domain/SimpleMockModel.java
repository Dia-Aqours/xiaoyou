/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class SimpleMockModel
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 1734127291874866162L;
/* 11:   */   @ApiField("count_items")
/* 12:   */   private Long countItems;
/* 13:   */   @ApiField("happen_time")
/* 14:   */   private Date happenTime;
/* 15:   */   @ApiField("price_num")
/* 16:   */   private String priceNum;
/* 17:   */   @ApiField("right")
/* 18:   */   private Boolean right;
/* 19:   */   @ApiField("trade_no")
/* 20:   */   private String tradeNo;
/* 21:   */   
/* 22:   */   public Long getCountItems()
/* 23:   */   {
/* 24:49 */     return this.countItems;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setCountItems(Long countItems)
/* 28:   */   {
/* 29:52 */     this.countItems = countItems;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public Date getHappenTime()
/* 33:   */   {
/* 34:56 */     return this.happenTime;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setHappenTime(Date happenTime)
/* 38:   */   {
/* 39:59 */     this.happenTime = happenTime;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getPriceNum()
/* 43:   */   {
/* 44:63 */     return this.priceNum;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setPriceNum(String priceNum)
/* 48:   */   {
/* 49:66 */     this.priceNum = priceNum;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public Boolean getRight()
/* 53:   */   {
/* 54:70 */     return this.right;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setRight(Boolean right)
/* 58:   */   {
/* 59:73 */     this.right = right;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public String getTradeNo()
/* 63:   */   {
/* 64:77 */     return this.tradeNo;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void setTradeNo(String tradeNo)
/* 68:   */   {
/* 69:80 */     this.tradeNo = tradeNo;
/* 70:   */   }
/* 71:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.SimpleMockModel
 * JD-Core Version:    0.7.0.1
 */
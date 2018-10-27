/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;

/*  6:   */
/*  7:   */ public class PromoItemInfo
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5141756791358787616L;
/* 11:   */   @ApiField("constraint_info")
/* 12:   */   private ConstraintInfo constraintInfo;
/* 13:   */   @ApiField("id")
/* 14:   */   private String id;
/* 15:   */   @ApiField("sale_end_time")
/* 16:   */   private String saleEndTime;
/* 17:   */   @ApiField("sale_start_time")
/* 18:   */   private Date saleStartTime;
/* 19:   */   @ApiField("total_inventory")
/* 20:   */   private String totalInventory;
/* 21:   */   @ApiField("voucher")
/* 22:   */   private Voucher voucher;
/* 23:   */   
/* 24:   */   public ConstraintInfo getConstraintInfo()
/* 25:   */   {
/* 26:55 */     return this.constraintInfo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setConstraintInfo(ConstraintInfo constraintInfo)
/* 30:   */   {
/* 31:58 */     this.constraintInfo = constraintInfo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getId()
/* 35:   */   {
/* 36:62 */     return this.id;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setId(String id)
/* 40:   */   {
/* 41:65 */     this.id = id;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getSaleEndTime()
/* 45:   */   {
/* 46:69 */     return this.saleEndTime;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setSaleEndTime(String saleEndTime)
/* 50:   */   {
/* 51:72 */     this.saleEndTime = saleEndTime;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Date getSaleStartTime()
/* 55:   */   {
/* 56:76 */     return this.saleStartTime;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setSaleStartTime(Date saleStartTime)
/* 60:   */   {
/* 61:79 */     this.saleStartTime = saleStartTime;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getTotalInventory()
/* 65:   */   {
/* 66:83 */     return this.totalInventory;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setTotalInventory(String totalInventory)
/* 70:   */   {
/* 71:86 */     this.totalInventory = totalInventory;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public Voucher getVoucher()
/* 75:   */   {
/* 76:90 */     return this.voucher;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void setVoucher(Voucher voucher)
/* 80:   */   {
/* 81:93 */     this.voucher = voucher;
/* 82:   */   }
/* 83:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.PromoItemInfo

 * JD-Core Version:    0.7.0.1

 */
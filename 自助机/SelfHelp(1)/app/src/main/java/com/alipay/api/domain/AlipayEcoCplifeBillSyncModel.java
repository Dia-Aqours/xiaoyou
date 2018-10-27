/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayEcoCplifeBillSyncModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1265734939471287749L;
/* 10:   */   @ApiField("bill_entry_id")
/* 11:   */   private String billEntryId;
/* 12:   */   @ApiField("community_id")
/* 13:   */   private String communityId;
/* 14:   */   @ApiField("new_deadline")
/* 15:   */   private String newDeadline;
/* 16:   */   @ApiField("new_entry_amount")
/* 17:   */   private String newEntryAmount;
/* 18:   */   @ApiField("operate_type")
/* 19:   */   private String operateType;
/* 20:   */   
/* 21:   */   public String getBillEntryId()
/* 22:   */   {
/* 23:53 */     return this.billEntryId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setBillEntryId(String billEntryId)
/* 27:   */   {
/* 28:56 */     this.billEntryId = billEntryId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCommunityId()
/* 32:   */   {
/* 33:60 */     return this.communityId;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCommunityId(String communityId)
/* 37:   */   {
/* 38:63 */     this.communityId = communityId;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getNewDeadline()
/* 42:   */   {
/* 43:67 */     return this.newDeadline;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setNewDeadline(String newDeadline)
/* 47:   */   {
/* 48:70 */     this.newDeadline = newDeadline;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getNewEntryAmount()
/* 52:   */   {
/* 53:74 */     return this.newEntryAmount;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setNewEntryAmount(String newEntryAmount)
/* 57:   */   {
/* 58:77 */     this.newEntryAmount = newEntryAmount;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getOperateType()
/* 62:   */   {
/* 63:81 */     return this.operateType;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setOperateType(String operateType)
/* 67:   */   {
/* 68:84 */     this.operateType = operateType;
/* 69:   */   }
/* 70:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoCplifeBillSyncModel

 * JD-Core Version:    0.7.0.1

 */
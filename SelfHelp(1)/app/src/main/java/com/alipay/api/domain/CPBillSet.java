/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class CPBillSet
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2181199541737146518L;
/*  10:    */   @ApiField("acct_period")
/*  11:    */   private String acctPeriod;
/*  12:    */   @ApiField("bill_entry_amount")
/*  13:    */   private String billEntryAmount;
/*  14:    */   @ApiField("bill_entry_id")
/*  15:    */   private String billEntryId;
/*  16:    */   @ApiField("cost_type")
/*  17:    */   private String costType;
/*  18:    */   @ApiField("deadline")
/*  19:    */   private String deadline;
/*  20:    */   @ApiField("out_room_id")
/*  21:    */   private String outRoomId;
/*  22:    */   @ApiField("release_day")
/*  23:    */   private String releaseDay;
/*  24:    */   @ApiField("room_address")
/*  25:    */   private String roomAddress;
/*  26:    */   
/*  27:    */   public String getAcctPeriod()
/*  28:    */   {
/*  29: 65 */     return this.acctPeriod;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setAcctPeriod(String acctPeriod)
/*  33:    */   {
/*  34: 68 */     this.acctPeriod = acctPeriod;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getBillEntryAmount()
/*  38:    */   {
/*  39: 72 */     return this.billEntryAmount;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setBillEntryAmount(String billEntryAmount)
/*  43:    */   {
/*  44: 75 */     this.billEntryAmount = billEntryAmount;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getBillEntryId()
/*  48:    */   {
/*  49: 79 */     return this.billEntryId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setBillEntryId(String billEntryId)
/*  53:    */   {
/*  54: 82 */     this.billEntryId = billEntryId;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getCostType()
/*  58:    */   {
/*  59: 86 */     return this.costType;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setCostType(String costType)
/*  63:    */   {
/*  64: 89 */     this.costType = costType;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getDeadline()
/*  68:    */   {
/*  69: 93 */     return this.deadline;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setDeadline(String deadline)
/*  73:    */   {
/*  74: 96 */     this.deadline = deadline;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getOutRoomId()
/*  78:    */   {
/*  79:100 */     return this.outRoomId;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setOutRoomId(String outRoomId)
/*  83:    */   {
/*  84:103 */     this.outRoomId = outRoomId;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getReleaseDay()
/*  88:    */   {
/*  89:107 */     return this.releaseDay;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setReleaseDay(String releaseDay)
/*  93:    */   {
/*  94:110 */     this.releaseDay = releaseDay;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getRoomAddress()
/*  98:    */   {
/*  99:114 */     return this.roomAddress;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setRoomAddress(String roomAddress)
/* 103:    */   {
/* 104:117 */     this.roomAddress = roomAddress;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CPBillSet
 * JD-Core Version:    0.7.0.1
 */
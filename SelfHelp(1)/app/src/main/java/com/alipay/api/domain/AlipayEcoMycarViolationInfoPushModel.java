/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class AlipayEcoMycarViolationInfoPushModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 3189663282326485473L;
/*  11:    */   @ApiField("deal_type")
/*  12:    */   private String dealType;
/*  13:    */   @ApiField("push_type")
/*  14:    */   private String pushType;
/*  15:    */   @ApiField("vi_address")
/*  16:    */   private String viAddress;
/*  17:    */   @ApiField("vi_fine")
/*  18:    */   private String viFine;
/*  19:    */   @ApiField("vi_handled")
/*  20:    */   private String viHandled;
/*  21:    */   @ApiField("vi_number")
/*  22:    */   private String viNumber;
/*  23:    */   @ApiField("vi_point")
/*  24:    */   private String viPoint;
/*  25:    */   @ApiField("vi_time")
/*  26:    */   private Date viTime;
/*  27:    */   @ApiField("vi_type")
/*  28:    */   private String viType;
/*  29:    */   
/*  30:    */   public String getDealType()
/*  31:    */   {
/*  32: 73 */     return this.dealType;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setDealType(String dealType)
/*  36:    */   {
/*  37: 76 */     this.dealType = dealType;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getPushType()
/*  41:    */   {
/*  42: 80 */     return this.pushType;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setPushType(String pushType)
/*  46:    */   {
/*  47: 83 */     this.pushType = pushType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getViAddress()
/*  51:    */   {
/*  52: 87 */     return this.viAddress;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setViAddress(String viAddress)
/*  56:    */   {
/*  57: 90 */     this.viAddress = viAddress;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getViFine()
/*  61:    */   {
/*  62: 94 */     return this.viFine;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setViFine(String viFine)
/*  66:    */   {
/*  67: 97 */     this.viFine = viFine;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getViHandled()
/*  71:    */   {
/*  72:101 */     return this.viHandled;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setViHandled(String viHandled)
/*  76:    */   {
/*  77:104 */     this.viHandled = viHandled;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getViNumber()
/*  81:    */   {
/*  82:108 */     return this.viNumber;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setViNumber(String viNumber)
/*  86:    */   {
/*  87:111 */     this.viNumber = viNumber;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getViPoint()
/*  91:    */   {
/*  92:115 */     return this.viPoint;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setViPoint(String viPoint)
/*  96:    */   {
/*  97:118 */     this.viPoint = viPoint;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public Date getViTime()
/* 101:    */   {
/* 102:122 */     return this.viTime;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setViTime(Date viTime)
/* 106:    */   {
/* 107:125 */     this.viTime = viTime;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getViType()
/* 111:    */   {
/* 112:129 */     return this.viType;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setViType(String viType)
/* 116:    */   {
/* 117:132 */     this.viType = viType;
/* 118:    */   }
/* 119:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarViolationInfoPushModel

 * JD-Core Version:    0.7.0.1

 */
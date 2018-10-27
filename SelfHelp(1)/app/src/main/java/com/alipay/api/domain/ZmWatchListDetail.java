/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class ZmWatchListDetail
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 8288296673361545831L;
/*  11:    */   @ApiField("biz_code")
/*  12:    */   private String bizCode;
/*  13:    */   @ApiField("code")
/*  14:    */   private String code;
/*  15:    */   @ApiField("extend_info")
/*  16:    */   private ZmWatchListExtendInfo extendInfo;
/*  17:    */   @ApiField("refresh_time")
/*  18:    */   private Date refreshTime;
/*  19:    */   @ApiField("settlement")
/*  20:    */   private Boolean settlement;
/*  21:    */   @ApiField("statement")
/*  22:    */   private String statement;
/*  23:    */   @ApiField("status")
/*  24:    */   private String status;
/*  25:    */   @ApiField("type")
/*  26:    */   private String type;
/*  27:    */   
/*  28:    */   public String getBizCode()
/*  29:    */   {
/*  30: 78 */     return this.bizCode;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setBizCode(String bizCode)
/*  34:    */   {
/*  35: 81 */     this.bizCode = bizCode;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getCode()
/*  39:    */   {
/*  40: 85 */     return this.code;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setCode(String code)
/*  44:    */   {
/*  45: 88 */     this.code = code;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public ZmWatchListExtendInfo getExtendInfo()
/*  49:    */   {
/*  50: 92 */     return this.extendInfo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setExtendInfo(ZmWatchListExtendInfo extendInfo)
/*  54:    */   {
/*  55: 95 */     this.extendInfo = extendInfo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Date getRefreshTime()
/*  59:    */   {
/*  60: 99 */     return this.refreshTime;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setRefreshTime(Date refreshTime)
/*  64:    */   {
/*  65:102 */     this.refreshTime = refreshTime;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public Boolean getSettlement()
/*  69:    */   {
/*  70:106 */     return this.settlement;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setSettlement(Boolean settlement)
/*  74:    */   {
/*  75:109 */     this.settlement = settlement;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getStatement()
/*  79:    */   {
/*  80:113 */     return this.statement;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setStatement(String statement)
/*  84:    */   {
/*  85:116 */     this.statement = statement;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getStatus()
/*  89:    */   {
/*  90:120 */     return this.status;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setStatus(String status)
/*  94:    */   {
/*  95:123 */     this.status = status;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getType()
/*  99:    */   {
/* 100:127 */     return this.type;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setType(String type)
/* 104:    */   {
/* 105:130 */     this.type = type;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZmWatchListDetail
 * JD-Core Version:    0.7.0.1
 */
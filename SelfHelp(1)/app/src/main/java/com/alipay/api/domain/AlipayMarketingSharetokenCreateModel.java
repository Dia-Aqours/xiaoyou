/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class AlipayMarketingSharetokenCreateModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1744817723485211733L;
/*  11:    */   @ApiField("biz_linked_id")
/*  12:    */   private String bizLinkedId;
/*  13:    */   @ApiField("biz_type")
/*  14:    */   private String bizType;
/*  15:    */   @ApiField("btn_left")
/*  16:    */   private String btnLeft;
/*  17:    */   @ApiField("btn_left_href")
/*  18:    */   private String btnLeftHref;
/*  19:    */   @ApiField("btn_right")
/*  20:    */   private String btnRight;
/*  21:    */   @ApiField("btn_right_href")
/*  22:    */   private String btnRightHref;
/*  23:    */   @ApiField("desc")
/*  24:    */   private String desc;
/*  25:    */   @ApiField("icon")
/*  26:    */   private String icon;
/*  27:    */   @ApiField("start_date")
/*  28:    */   private Date startDate;
/*  29:    */   @ApiField("timeout")
/*  30:    */   private Long timeout;
/*  31:    */   @ApiField("title")
/*  32:    */   private String title;
/*  33:    */   
/*  34:    */   public String getBizLinkedId()
/*  35:    */   {
/*  36: 85 */     return this.bizLinkedId;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setBizLinkedId(String bizLinkedId)
/*  40:    */   {
/*  41: 88 */     this.bizLinkedId = bizLinkedId;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getBizType()
/*  45:    */   {
/*  46: 92 */     return this.bizType;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setBizType(String bizType)
/*  50:    */   {
/*  51: 95 */     this.bizType = bizType;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getBtnLeft()
/*  55:    */   {
/*  56: 99 */     return this.btnLeft;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setBtnLeft(String btnLeft)
/*  60:    */   {
/*  61:102 */     this.btnLeft = btnLeft;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getBtnLeftHref()
/*  65:    */   {
/*  66:106 */     return this.btnLeftHref;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setBtnLeftHref(String btnLeftHref)
/*  70:    */   {
/*  71:109 */     this.btnLeftHref = btnLeftHref;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getBtnRight()
/*  75:    */   {
/*  76:113 */     return this.btnRight;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setBtnRight(String btnRight)
/*  80:    */   {
/*  81:116 */     this.btnRight = btnRight;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getBtnRightHref()
/*  85:    */   {
/*  86:120 */     return this.btnRightHref;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setBtnRightHref(String btnRightHref)
/*  90:    */   {
/*  91:123 */     this.btnRightHref = btnRightHref;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getDesc()
/*  95:    */   {
/*  96:127 */     return this.desc;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setDesc(String desc)
/* 100:    */   {
/* 101:130 */     this.desc = desc;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getIcon()
/* 105:    */   {
/* 106:134 */     return this.icon;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setIcon(String icon)
/* 110:    */   {
/* 111:137 */     this.icon = icon;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public Date getStartDate()
/* 115:    */   {
/* 116:141 */     return this.startDate;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setStartDate(Date startDate)
/* 120:    */   {
/* 121:144 */     this.startDate = startDate;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public Long getTimeout()
/* 125:    */   {
/* 126:148 */     return this.timeout;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTimeout(Long timeout)
/* 130:    */   {
/* 131:151 */     this.timeout = timeout;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTitle()
/* 135:    */   {
/* 136:155 */     return this.title;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setTitle(String title)
/* 140:    */   {
/* 141:158 */     this.title = title;
/* 142:    */   }
/* 143:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayMarketingSharetokenCreateModel

 * JD-Core Version:    0.7.0.1

 */
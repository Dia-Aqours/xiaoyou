/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class InsPerson
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6233843364672341361L;
/*  11:    */   @ApiField("address")
/*  12:    */   private String address;
/*  13:    */   @ApiField("birthday")
/*  14:    */   private Date birthday;
/*  15:    */   @ApiField("biz_data")
/*  16:    */   private String bizData;
/*  17:    */   @ApiField("cert_name")
/*  18:    */   private String certName;
/*  19:    */   @ApiField("cert_no")
/*  20:    */   private String certNo;
/*  21:    */   @ApiField("cert_type")
/*  22:    */   private String certType;
/*  23:    */   @ApiField("channel_user_id")
/*  24:    */   private String channelUserId;
/*  25:    */   @ApiField("channel_user_source")
/*  26:    */   private String channelUserSource;
/*  27:    */   @ApiField("email")
/*  28:    */   private String email;
/*  29:    */   @ApiField("gender")
/*  30:    */   private String gender;
/*  31:    */   @ApiField("phone")
/*  32:    */   private String phone;
/*  33:    */   @ApiField("user_id")
/*  34:    */   private String userId;
/*  35:    */   
/*  36:    */   public String getAddress()
/*  37:    */   {
/*  38: 92 */     return this.address;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setAddress(String address)
/*  42:    */   {
/*  43: 95 */     this.address = address;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public Date getBirthday()
/*  47:    */   {
/*  48: 99 */     return this.birthday;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setBirthday(Date birthday)
/*  52:    */   {
/*  53:102 */     this.birthday = birthday;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getBizData()
/*  57:    */   {
/*  58:106 */     return this.bizData;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setBizData(String bizData)
/*  62:    */   {
/*  63:109 */     this.bizData = bizData;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getCertName()
/*  67:    */   {
/*  68:113 */     return this.certName;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setCertName(String certName)
/*  72:    */   {
/*  73:116 */     this.certName = certName;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getCertNo()
/*  77:    */   {
/*  78:120 */     return this.certNo;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setCertNo(String certNo)
/*  82:    */   {
/*  83:123 */     this.certNo = certNo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getCertType()
/*  87:    */   {
/*  88:127 */     return this.certType;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setCertType(String certType)
/*  92:    */   {
/*  93:130 */     this.certType = certType;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getChannelUserId()
/*  97:    */   {
/*  98:134 */     return this.channelUserId;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setChannelUserId(String channelUserId)
/* 102:    */   {
/* 103:137 */     this.channelUserId = channelUserId;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getChannelUserSource()
/* 107:    */   {
/* 108:141 */     return this.channelUserSource;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setChannelUserSource(String channelUserSource)
/* 112:    */   {
/* 113:144 */     this.channelUserSource = channelUserSource;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getEmail()
/* 117:    */   {
/* 118:148 */     return this.email;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setEmail(String email)
/* 122:    */   {
/* 123:151 */     this.email = email;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getGender()
/* 127:    */   {
/* 128:155 */     return this.gender;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setGender(String gender)
/* 132:    */   {
/* 133:158 */     this.gender = gender;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getPhone()
/* 137:    */   {
/* 138:162 */     return this.phone;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setPhone(String phone)
/* 142:    */   {
/* 143:165 */     this.phone = phone;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getUserId()
/* 147:    */   {
/* 148:169 */     return this.userId;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setUserId(String userId)
/* 152:    */   {
/* 153:172 */     this.userId = userId;
/* 154:    */   }
/* 155:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsPerson
 * JD-Core Version:    0.7.0.1
 */
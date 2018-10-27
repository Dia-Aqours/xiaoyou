/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayBossCsChannelQueryModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7381945524373579232L;
/*  10:    */   @ApiField("att")
/*  11:    */   private String att;
/*  12:    */   @ApiField("connectionrate")
/*  13:    */   private String connectionrate;
/*  14:    */   @ApiField("curragentsloggedin")
/*  15:    */   private String curragentsloggedin;
/*  16:    */   @ApiField("curragenttalking")
/*  17:    */   private String curragenttalking;
/*  18:    */   @ApiField("currentnotreadyagents")
/*  19:    */   private String currentnotreadyagents;
/*  20:    */   @ApiField("currentreadyagents")
/*  21:    */   private String currentreadyagents;
/*  22:    */   @ApiField("currnumberwaitingcalls")
/*  23:    */   private String currnumberwaitingcalls;
/*  24:    */   @ApiField("endkey")
/*  25:    */   private String endkey;
/*  26:    */   @ApiField("startkey")
/*  27:    */   private String startkey;
/*  28:    */   @ApiField("visitorinflow")
/*  29:    */   private String visitorinflow;
/*  30:    */   @ApiField("visitorresponse")
/*  31:    */   private String visitorresponse;
/*  32:    */   @ApiField("visitorresponsetransfer")
/*  33:    */   private String visitorresponsetransfer;
/*  34:    */   
/*  35:    */   public String getAtt()
/*  36:    */   {
/*  37: 89 */     return this.att;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setAtt(String att)
/*  41:    */   {
/*  42: 92 */     this.att = att;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getConnectionrate()
/*  46:    */   {
/*  47: 96 */     return this.connectionrate;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setConnectionrate(String connectionrate)
/*  51:    */   {
/*  52: 99 */     this.connectionrate = connectionrate;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getCurragentsloggedin()
/*  56:    */   {
/*  57:103 */     return this.curragentsloggedin;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setCurragentsloggedin(String curragentsloggedin)
/*  61:    */   {
/*  62:106 */     this.curragentsloggedin = curragentsloggedin;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getCurragenttalking()
/*  66:    */   {
/*  67:110 */     return this.curragenttalking;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setCurragenttalking(String curragenttalking)
/*  71:    */   {
/*  72:113 */     this.curragenttalking = curragenttalking;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getCurrentnotreadyagents()
/*  76:    */   {
/*  77:117 */     return this.currentnotreadyagents;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setCurrentnotreadyagents(String currentnotreadyagents)
/*  81:    */   {
/*  82:120 */     this.currentnotreadyagents = currentnotreadyagents;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getCurrentreadyagents()
/*  86:    */   {
/*  87:124 */     return this.currentreadyagents;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setCurrentreadyagents(String currentreadyagents)
/*  91:    */   {
/*  92:127 */     this.currentreadyagents = currentreadyagents;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getCurrnumberwaitingcalls()
/*  96:    */   {
/*  97:131 */     return this.currnumberwaitingcalls;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setCurrnumberwaitingcalls(String currnumberwaitingcalls)
/* 101:    */   {
/* 102:134 */     this.currnumberwaitingcalls = currnumberwaitingcalls;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getEndkey()
/* 106:    */   {
/* 107:138 */     return this.endkey;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setEndkey(String endkey)
/* 111:    */   {
/* 112:141 */     this.endkey = endkey;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getStartkey()
/* 116:    */   {
/* 117:145 */     return this.startkey;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setStartkey(String startkey)
/* 121:    */   {
/* 122:148 */     this.startkey = startkey;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getVisitorinflow()
/* 126:    */   {
/* 127:152 */     return this.visitorinflow;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setVisitorinflow(String visitorinflow)
/* 131:    */   {
/* 132:155 */     this.visitorinflow = visitorinflow;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getVisitorresponse()
/* 136:    */   {
/* 137:159 */     return this.visitorresponse;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setVisitorresponse(String visitorresponse)
/* 141:    */   {
/* 142:162 */     this.visitorresponse = visitorresponse;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getVisitorresponsetransfer()
/* 146:    */   {
/* 147:166 */     return this.visitorresponsetransfer;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setVisitorresponsetransfer(String visitorresponsetransfer)
/* 151:    */   {
/* 152:169 */     this.visitorresponsetransfer = visitorresponsetransfer;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayBossCsChannelQueryModel
 * JD-Core Version:    0.7.0.1
 */
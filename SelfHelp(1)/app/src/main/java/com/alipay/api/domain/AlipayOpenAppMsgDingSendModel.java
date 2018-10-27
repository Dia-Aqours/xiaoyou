/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayOpenAppMsgDingSendModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 1223875857696658936L;
/*  12:    */   @ApiField("agent_id")
/*  13:    */   private String agentId;
/*  14:    */   @ApiField("content")
/*  15:    */   private String content;
/*  16:    */   @ApiField("goto_url")
/*  17:    */   private String gotoUrl;
/*  18:    */   @ApiField("image_url")
/*  19:    */   private String imageUrl;
/*  20:    */   @ApiField("msg_type")
/*  21:    */   private String msgType;
/*  22:    */   @ApiField("receiver")
/*  23:    */   private String receiver;
/*  24:    */   @ApiField("title")
/*  25:    */   private String title;
/*  26:    */   @ApiListField("user_ids")
/*  27:    */   @ApiField("string")
/*  28:    */   private List<String> userIds;
/*  29:    */   
/*  30:    */   public String getAgentId()
/*  31:    */   {
/*  32: 69 */     return this.agentId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setAgentId(String agentId)
/*  36:    */   {
/*  37: 72 */     this.agentId = agentId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getContent()
/*  41:    */   {
/*  42: 76 */     return this.content;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setContent(String content)
/*  46:    */   {
/*  47: 79 */     this.content = content;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getGotoUrl()
/*  51:    */   {
/*  52: 83 */     return this.gotoUrl;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setGotoUrl(String gotoUrl)
/*  56:    */   {
/*  57: 86 */     this.gotoUrl = gotoUrl;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getImageUrl()
/*  61:    */   {
/*  62: 90 */     return this.imageUrl;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setImageUrl(String imageUrl)
/*  66:    */   {
/*  67: 93 */     this.imageUrl = imageUrl;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getMsgType()
/*  71:    */   {
/*  72: 97 */     return this.msgType;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setMsgType(String msgType)
/*  76:    */   {
/*  77:100 */     this.msgType = msgType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getReceiver()
/*  81:    */   {
/*  82:104 */     return this.receiver;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setReceiver(String receiver)
/*  86:    */   {
/*  87:107 */     this.receiver = receiver;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getTitle()
/*  91:    */   {
/*  92:111 */     return this.title;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setTitle(String title)
/*  96:    */   {
/*  97:114 */     this.title = title;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public List<String> getUserIds()
/* 101:    */   {
/* 102:118 */     return this.userIds;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setUserIds(List<String> userIds)
/* 106:    */   {
/* 107:121 */     this.userIds = userIds;
/* 108:    */   }
/* 109:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenAppMsgDingSendModel
 * JD-Core Version:    0.7.0.1
 */
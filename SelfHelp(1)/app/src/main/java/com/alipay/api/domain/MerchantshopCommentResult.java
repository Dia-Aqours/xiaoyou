/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class MerchantshopCommentResult
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3475657349269996276L;
/*  10:    */   @ApiField("comment")
/*  11:    */   private String comment;
/*  12:    */   @ApiField("comment_time")
/*  13:    */   private String commentTime;
/*  14:    */   @ApiField("face")
/*  15:    */   private String face;
/*  16:    */   @ApiField("imgs")
/*  17:    */   private String imgs;
/*  18:    */   @ApiField("nick_name")
/*  19:    */   private String nickName;
/*  20:    */   @ApiField("order_no")
/*  21:    */   private String orderNo;
/*  22:    */   @ApiField("reply")
/*  23:    */   private String reply;
/*  24:    */   @ApiField("reply_time")
/*  25:    */   private String replyTime;
/*  26:    */   @ApiField("score")
/*  27:    */   private String score;
/*  28:    */   @ApiField("shop_id")
/*  29:    */   private Long shopId;
/*  30:    */   @ApiField("user_id")
/*  31:    */   private String userId;
/*  32:    */   @ApiField("user_name")
/*  33:    */   private String userName;
/*  34:    */   
/*  35:    */   public String getComment()
/*  36:    */   {
/*  37: 89 */     return this.comment;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setComment(String comment)
/*  41:    */   {
/*  42: 92 */     this.comment = comment;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getCommentTime()
/*  46:    */   {
/*  47: 96 */     return this.commentTime;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setCommentTime(String commentTime)
/*  51:    */   {
/*  52: 99 */     this.commentTime = commentTime;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getFace()
/*  56:    */   {
/*  57:103 */     return this.face;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setFace(String face)
/*  61:    */   {
/*  62:106 */     this.face = face;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getImgs()
/*  66:    */   {
/*  67:110 */     return this.imgs;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setImgs(String imgs)
/*  71:    */   {
/*  72:113 */     this.imgs = imgs;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getNickName()
/*  76:    */   {
/*  77:117 */     return this.nickName;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setNickName(String nickName)
/*  81:    */   {
/*  82:120 */     this.nickName = nickName;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getOrderNo()
/*  86:    */   {
/*  87:124 */     return this.orderNo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setOrderNo(String orderNo)
/*  91:    */   {
/*  92:127 */     this.orderNo = orderNo;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getReply()
/*  96:    */   {
/*  97:131 */     return this.reply;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setReply(String reply)
/* 101:    */   {
/* 102:134 */     this.reply = reply;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getReplyTime()
/* 106:    */   {
/* 107:138 */     return this.replyTime;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setReplyTime(String replyTime)
/* 111:    */   {
/* 112:141 */     this.replyTime = replyTime;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getScore()
/* 116:    */   {
/* 117:145 */     return this.score;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setScore(String score)
/* 121:    */   {
/* 122:148 */     this.score = score;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public Long getShopId()
/* 126:    */   {
/* 127:152 */     return this.shopId;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setShopId(Long shopId)
/* 131:    */   {
/* 132:155 */     this.shopId = shopId;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getUserId()
/* 136:    */   {
/* 137:159 */     return this.userId;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setUserId(String userId)
/* 141:    */   {
/* 142:162 */     this.userId = userId;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getUserName()
/* 146:    */   {
/* 147:166 */     return this.userName;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setUserName(String userName)
/* 151:    */   {
/* 152:169 */     this.userName = userName;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MerchantshopCommentResult
 * JD-Core Version:    0.7.0.1
 */
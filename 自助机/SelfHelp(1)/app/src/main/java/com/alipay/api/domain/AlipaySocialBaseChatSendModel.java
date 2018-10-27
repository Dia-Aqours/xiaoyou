/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipaySocialBaseChatSendModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2866863314497643676L;
/*  10:    */   @ApiField("biz_memo")
/*  11:    */   private String bizMemo;
/*  12:    */   @ApiField("client_msg_id")
/*  13:    */   private String clientMsgId;
/*  14:    */   @ApiField("link")
/*  15:    */   private String link;
/*  16:    */   @ApiField("receiver_id")
/*  17:    */   private String receiverId;
/*  18:    */   @ApiField("receiver_usertype")
/*  19:    */   private String receiverUsertype;
/*  20:    */   @ApiField("template_data")
/*  21:    */   private String templateData;
/*  22:    */   @ApiField("template_type")
/*  23:    */   private String templateType;
/*  24:    */   
/*  25:    */   public String getBizMemo()
/*  26:    */   {
/*  27: 70 */     return this.bizMemo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setBizMemo(String bizMemo)
/*  31:    */   {
/*  32: 73 */     this.bizMemo = bizMemo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getClientMsgId()
/*  36:    */   {
/*  37: 77 */     return this.clientMsgId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setClientMsgId(String clientMsgId)
/*  41:    */   {
/*  42: 80 */     this.clientMsgId = clientMsgId;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getLink()
/*  46:    */   {
/*  47: 84 */     return this.link;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setLink(String link)
/*  51:    */   {
/*  52: 87 */     this.link = link;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getReceiverId()
/*  56:    */   {
/*  57: 91 */     return this.receiverId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setReceiverId(String receiverId)
/*  61:    */   {
/*  62: 94 */     this.receiverId = receiverId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getReceiverUsertype()
/*  66:    */   {
/*  67: 98 */     return this.receiverUsertype;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setReceiverUsertype(String receiverUsertype)
/*  71:    */   {
/*  72:101 */     this.receiverUsertype = receiverUsertype;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getTemplateData()
/*  76:    */   {
/*  77:105 */     return this.templateData;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setTemplateData(String templateData)
/*  81:    */   {
/*  82:108 */     this.templateData = templateData;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getTemplateType()
/*  86:    */   {
/*  87:112 */     return this.templateType;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setTemplateType(String templateType)
/*  91:    */   {
/*  92:115 */     this.templateType = templateType;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySocialBaseChatSendModel
 * JD-Core Version:    0.7.0.1
 */
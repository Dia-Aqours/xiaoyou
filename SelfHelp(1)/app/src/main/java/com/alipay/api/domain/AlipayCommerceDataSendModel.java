/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayCommerceDataSendModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8721459619222882937L;
/*  10:    */   @ApiField("channel")
/*  11:    */   private String channel;
/*  12:    */   @ApiField("op_code")
/*  13:    */   private String opCode;
/*  14:    */   @ApiField("op_data")
/*  15:    */   private String opData;
/*  16:    */   @ApiField("scene_code")
/*  17:    */   private String sceneCode;
/*  18:    */   @ApiField("scene_data")
/*  19:    */   private String sceneData;
/*  20:    */   @ApiField("target_id")
/*  21:    */   private String targetId;
/*  22:    */   @ApiField("target_id_type")
/*  23:    */   private String targetIdType;
/*  24:    */   @ApiField("version")
/*  25:    */   private String version;
/*  26:    */   
/*  27:    */   public String getChannel()
/*  28:    */   {
/*  29: 89 */     return this.channel;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setChannel(String channel)
/*  33:    */   {
/*  34: 92 */     this.channel = channel;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getOpCode()
/*  38:    */   {
/*  39: 96 */     return this.opCode;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setOpCode(String opCode)
/*  43:    */   {
/*  44: 99 */     this.opCode = opCode;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getOpData()
/*  48:    */   {
/*  49:103 */     return this.opData;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setOpData(String opData)
/*  53:    */   {
/*  54:106 */     this.opData = opData;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getSceneCode()
/*  58:    */   {
/*  59:110 */     return this.sceneCode;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setSceneCode(String sceneCode)
/*  63:    */   {
/*  64:113 */     this.sceneCode = sceneCode;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getSceneData()
/*  68:    */   {
/*  69:117 */     return this.sceneData;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setSceneData(String sceneData)
/*  73:    */   {
/*  74:120 */     this.sceneData = sceneData;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getTargetId()
/*  78:    */   {
/*  79:124 */     return this.targetId;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTargetId(String targetId)
/*  83:    */   {
/*  84:127 */     this.targetId = targetId;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTargetIdType()
/*  88:    */   {
/*  89:131 */     return this.targetIdType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTargetIdType(String targetIdType)
/*  93:    */   {
/*  94:134 */     this.targetIdType = targetIdType;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getVersion()
/*  98:    */   {
/*  99:138 */     return this.version;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setVersion(String version)
/* 103:    */   {
/* 104:141 */     this.version = version;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceDataSendModel
 * JD-Core Version:    0.7.0.1
 */
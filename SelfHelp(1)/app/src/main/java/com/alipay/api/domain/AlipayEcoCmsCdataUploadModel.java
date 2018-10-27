/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class AlipayEcoCmsCdataUploadModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 3239938882668788277L;
/*  11:    */   @ApiField("attribute")
/*  12:    */   private String attribute;
/*  13:    */   @ApiField("category")
/*  14:    */   private String category;
/*  15:    */   @ApiField("exp_time")
/*  16:    */   private Date expTime;
/*  17:    */   @ApiField("merch_id")
/*  18:    */   private String merchId;
/*  19:    */   @ApiField("op_data")
/*  20:    */   private String opData;
/*  21:    */   @ApiField("scene_data")
/*  22:    */   private String sceneData;
/*  23:    */   @ApiField("start_time")
/*  24:    */   private Date startTime;
/*  25:    */   @ApiField("syn")
/*  26:    */   private Boolean syn;
/*  27:    */   @ApiField("t_v")
/*  28:    */   private String tV;
/*  29:    */   @ApiField("tamplate_id")
/*  30:    */   private Long tamplateId;
/*  31:    */   @ApiField("target_id")
/*  32:    */   private String targetId;
/*  33:    */   
/*  34:    */   public String getAttribute()
/*  35:    */   {
/*  36:100 */     return this.attribute;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setAttribute(String attribute)
/*  40:    */   {
/*  41:103 */     this.attribute = attribute;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getCategory()
/*  45:    */   {
/*  46:107 */     return this.category;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setCategory(String category)
/*  50:    */   {
/*  51:110 */     this.category = category;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public Date getExpTime()
/*  55:    */   {
/*  56:114 */     return this.expTime;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setExpTime(Date expTime)
/*  60:    */   {
/*  61:117 */     this.expTime = expTime;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getMerchId()
/*  65:    */   {
/*  66:121 */     return this.merchId;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setMerchId(String merchId)
/*  70:    */   {
/*  71:124 */     this.merchId = merchId;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getOpData()
/*  75:    */   {
/*  76:128 */     return this.opData;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setOpData(String opData)
/*  80:    */   {
/*  81:131 */     this.opData = opData;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getSceneData()
/*  85:    */   {
/*  86:135 */     return this.sceneData;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setSceneData(String sceneData)
/*  90:    */   {
/*  91:138 */     this.sceneData = sceneData;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public Date getStartTime()
/*  95:    */   {
/*  96:142 */     return this.startTime;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setStartTime(Date startTime)
/* 100:    */   {
/* 101:145 */     this.startTime = startTime;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public Boolean getSyn()
/* 105:    */   {
/* 106:149 */     return this.syn;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setSyn(Boolean syn)
/* 110:    */   {
/* 111:152 */     this.syn = syn;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String gettV()
/* 115:    */   {
/* 116:156 */     return this.tV;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void settV(String tV)
/* 120:    */   {
/* 121:159 */     this.tV = tV;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public Long getTamplateId()
/* 125:    */   {
/* 126:163 */     return this.tamplateId;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTamplateId(Long tamplateId)
/* 130:    */   {
/* 131:166 */     this.tamplateId = tamplateId;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTargetId()
/* 135:    */   {
/* 136:170 */     return this.targetId;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setTargetId(String targetId)
/* 140:    */   {
/* 141:173 */     this.targetId = targetId;
/* 142:    */   }
/* 143:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoCmsCdataUploadModel

 * JD-Core Version:    0.7.0.1

 */
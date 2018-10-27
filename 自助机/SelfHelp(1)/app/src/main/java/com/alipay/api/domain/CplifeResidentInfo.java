/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class CplifeResidentInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1454951584255118422L;
/* 10:   */   @ApiField("entity_id")
/* 11:   */   private String entityId;
/* 12:   */   @ApiField("idcard_no")
/* 13:   */   private String idcardNo;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   @ApiField("out_entity_id")
/* 17:   */   private String outEntityId;
/* 18:   */   @ApiField("out_resident_id")
/* 19:   */   private String outResidentId;
/* 20:   */   @ApiField("type")
/* 21:   */   private String type;
/* 22:   */   
/* 23:   */   public String getEntityId()
/* 24:   */   {
/* 25:53 */     return this.entityId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setEntityId(String entityId)
/* 29:   */   {
/* 30:56 */     this.entityId = entityId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getIdcardNo()
/* 34:   */   {
/* 35:60 */     return this.idcardNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setIdcardNo(String idcardNo)
/* 39:   */   {
/* 40:63 */     this.idcardNo = idcardNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getName()
/* 44:   */   {
/* 45:67 */     return this.name;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setName(String name)
/* 49:   */   {
/* 50:70 */     this.name = name;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOutEntityId()
/* 54:   */   {
/* 55:74 */     return this.outEntityId;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOutEntityId(String outEntityId)
/* 59:   */   {
/* 60:77 */     this.outEntityId = outEntityId;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getOutResidentId()
/* 64:   */   {
/* 65:81 */     return this.outResidentId;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setOutResidentId(String outResidentId)
/* 69:   */   {
/* 70:84 */     this.outResidentId = outResidentId;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getType()
/* 74:   */   {
/* 75:88 */     return this.type;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setType(String type)
/* 79:   */   {
/* 80:91 */     this.type = type;
/* 81:   */   }
/* 82:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.CplifeResidentInfo

 * JD-Core Version:    0.7.0.1

 */
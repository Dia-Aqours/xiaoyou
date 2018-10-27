/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class CustomTagInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8597891894791776631L;
/* 12:   */   @ApiListField("enum_values")
/* 13:   */   @ApiField("data_enum_value")
/* 14:   */   private List<DataEnumValue> enumValues;
/* 15:   */   @ApiField("memo")
/* 16:   */   private String memo;
/* 17:   */   @ApiField("name")
/* 18:   */   private String name;
/* 19:   */   @ApiField("tag_code")
/* 20:   */   private String tagCode;
/* 21:   */   
/* 22:   */   public List<DataEnumValue> getEnumValues()
/* 23:   */   {
/* 24:45 */     return this.enumValues;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setEnumValues(List<DataEnumValue> enumValues)
/* 28:   */   {
/* 29:48 */     this.enumValues = enumValues;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getMemo()
/* 33:   */   {
/* 34:52 */     return this.memo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setMemo(String memo)
/* 38:   */   {
/* 39:55 */     this.memo = memo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getName()
/* 43:   */   {
/* 44:59 */     return this.name;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setName(String name)
/* 48:   */   {
/* 49:62 */     this.name = name;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getTagCode()
/* 53:   */   {
/* 54:66 */     return this.tagCode;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setTagCode(String tagCode)
/* 58:   */   {
/* 59:69 */     this.tagCode = tagCode;
/* 60:   */   }
/* 61:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.CustomTagInfo

 * JD-Core Version:    0.7.0.1

 */
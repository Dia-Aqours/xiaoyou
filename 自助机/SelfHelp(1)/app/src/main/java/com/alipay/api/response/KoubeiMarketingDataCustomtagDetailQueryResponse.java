/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.DataEnumValue;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiMarketingDataCustomtagDetailQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 3253512995655676486L;
/* 13:   */   @ApiListField("enum_values")
/* 14:   */   @ApiField("data_enum_value")
/* 15:   */   private List<DataEnumValue> enumValues;
/* 16:   */   @ApiField("memo")
/* 17:   */   private String memo;
/* 18:   */   @ApiField("name")
/* 19:   */   private String name;
/* 20:   */   @ApiField("tag_code")
/* 21:   */   private String tagCode;
/* 22:   */   
/* 23:   */   public void setEnumValues(List<DataEnumValue> enumValues)
/* 24:   */   {
/* 25:46 */     this.enumValues = enumValues;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<DataEnumValue> getEnumValues()
/* 29:   */   {
/* 30:49 */     return this.enumValues;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setMemo(String memo)
/* 34:   */   {
/* 35:53 */     this.memo = memo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getMemo()
/* 39:   */   {
/* 40:56 */     return this.memo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setName(String name)
/* 44:   */   {
/* 45:60 */     this.name = name;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getName()
/* 49:   */   {
/* 50:63 */     return this.name;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setTagCode(String tagCode)
/* 54:   */   {
/* 55:67 */     this.tagCode = tagCode;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String getTagCode()
/* 59:   */   {
/* 60:70 */     return this.tagCode;
/* 61:   */   }
/* 62:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataCustomtagDetailQueryResponse
 * JD-Core Version:    0.7.0.1
 */
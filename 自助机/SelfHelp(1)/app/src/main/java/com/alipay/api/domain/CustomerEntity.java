/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class CustomerEntity
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8212217259754815691L;
/* 12:   */   @ApiField("code")
/* 13:   */   private String code;
/* 14:   */   @ApiField("desc")
/* 15:   */   private String desc;
/* 16:   */   @ApiField("id")
/* 17:   */   private String id;
/* 18:   */   @ApiField("name")
/* 19:   */   private String name;
/* 20:   */   @ApiListField("tags")
/* 21:   */   @ApiField("customer_tag")
/* 22:   */   private List<CustomerTag> tags;
/* 23:   */   
/* 24:   */   public String getCode()
/* 25:   */   {
/* 26:51 */     return this.code;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setCode(String code)
/* 30:   */   {
/* 31:54 */     this.code = code;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getDesc()
/* 35:   */   {
/* 36:58 */     return this.desc;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setDesc(String desc)
/* 40:   */   {
/* 41:61 */     this.desc = desc;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getId()
/* 45:   */   {
/* 46:65 */     return this.id;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setId(String id)
/* 50:   */   {
/* 51:68 */     this.id = id;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getName()
/* 55:   */   {
/* 56:72 */     return this.name;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setName(String name)
/* 60:   */   {
/* 61:75 */     this.name = name;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public List<CustomerTag> getTags()
/* 65:   */   {
/* 66:79 */     return this.tags;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setTags(List<CustomerTag> tags)
/* 70:   */   {
/* 71:82 */     this.tags = tags;
/* 72:   */   }
/* 73:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.CustomerEntity

 * JD-Core Version:    0.7.0.1

 */
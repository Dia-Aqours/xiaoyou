/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayCreditCreditriskDataPutModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4685122318358767723L;
/*  10:    */   @ApiField("category")
/*  11:    */   private String category;
/*  12:    */   @ApiField("dataorgid")
/*  13:    */   private String dataorgid;
/*  14:    */   @ApiField("dataprovider")
/*  15:    */   private String dataprovider;
/*  16:    */   @ApiField("entitycode")
/*  17:    */   private String entitycode;
/*  18:    */   @ApiField("entityname")
/*  19:    */   private String entityname;
/*  20:    */   @ApiField("entitytype")
/*  21:    */   private String entitytype;
/*  22:    */   @ApiField("objectcontent")
/*  23:    */   private String objectcontent;
/*  24:    */   
/*  25:    */   public String getCategory()
/*  26:    */   {
/*  27: 59 */     return this.category;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setCategory(String category)
/*  31:    */   {
/*  32: 62 */     this.category = category;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getDataorgid()
/*  36:    */   {
/*  37: 66 */     return this.dataorgid;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setDataorgid(String dataorgid)
/*  41:    */   {
/*  42: 69 */     this.dataorgid = dataorgid;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getDataprovider()
/*  46:    */   {
/*  47: 73 */     return this.dataprovider;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setDataprovider(String dataprovider)
/*  51:    */   {
/*  52: 76 */     this.dataprovider = dataprovider;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getEntitycode()
/*  56:    */   {
/*  57: 80 */     return this.entitycode;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setEntitycode(String entitycode)
/*  61:    */   {
/*  62: 83 */     this.entitycode = entitycode;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getEntityname()
/*  66:    */   {
/*  67: 87 */     return this.entityname;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setEntityname(String entityname)
/*  71:    */   {
/*  72: 90 */     this.entityname = entityname;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getEntitytype()
/*  76:    */   {
/*  77: 94 */     return this.entitytype;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setEntitytype(String entitytype)
/*  81:    */   {
/*  82: 97 */     this.entitytype = entitytype;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getObjectcontent()
/*  86:    */   {
/*  87:101 */     return this.objectcontent;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setObjectcontent(String objectcontent)
/*  91:    */   {
/*  92:104 */     this.objectcontent = objectcontent;
/*  93:    */   }
/*  94:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayCreditCreditriskDataPutModel

 * JD-Core Version:    0.7.0.1

 */
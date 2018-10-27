/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class Context
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4649679394787849434L;
/*  10:    */   @ApiField("action_name")
/*  11:    */   private String actionName;
/*  12:    */   @ApiField("first")
/*  13:    */   private Keyword first;
/*  14:    */   @ApiField("head_color")
/*  15:    */   private String headColor;
/*  16:    */   @ApiField("keyword1")
/*  17:    */   private Keyword keyword1;
/*  18:    */   @ApiField("keyword2")
/*  19:    */   private Keyword keyword2;
/*  20:    */   @ApiField("remark")
/*  21:    */   private Keyword remark;
/*  22:    */   @ApiField("url")
/*  23:    */   private String url;
/*  24:    */   
/*  25:    */   public String getActionName()
/*  26:    */   {
/*  27: 59 */     return this.actionName;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setActionName(String actionName)
/*  31:    */   {
/*  32: 62 */     this.actionName = actionName;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public Keyword getFirst()
/*  36:    */   {
/*  37: 66 */     return this.first;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setFirst(Keyword first)
/*  41:    */   {
/*  42: 69 */     this.first = first;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getHeadColor()
/*  46:    */   {
/*  47: 73 */     return this.headColor;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setHeadColor(String headColor)
/*  51:    */   {
/*  52: 76 */     this.headColor = headColor;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public Keyword getKeyword1()
/*  56:    */   {
/*  57: 80 */     return this.keyword1;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setKeyword1(Keyword keyword1)
/*  61:    */   {
/*  62: 83 */     this.keyword1 = keyword1;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public Keyword getKeyword2()
/*  66:    */   {
/*  67: 87 */     return this.keyword2;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setKeyword2(Keyword keyword2)
/*  71:    */   {
/*  72: 90 */     this.keyword2 = keyword2;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public Keyword getRemark()
/*  76:    */   {
/*  77: 94 */     return this.remark;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setRemark(Keyword remark)
/*  81:    */   {
/*  82: 97 */     this.remark = remark;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getUrl()
/*  86:    */   {
/*  87:101 */     return this.url;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setUrl(String url)
/*  91:    */   {
/*  92:104 */     this.url = url;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Context
 * JD-Core Version:    0.7.0.1
 */
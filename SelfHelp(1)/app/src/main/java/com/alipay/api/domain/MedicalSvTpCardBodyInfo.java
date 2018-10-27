/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class MedicalSvTpCardBodyInfo
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3639117649922859348L;
/*  10:    */   @ApiField("content")
/*  11:    */   private String content;
/*  12:    */   @ApiField("image_url")
/*  13:    */   private String imageUrl;
/*  14:    */   @ApiField("link_url")
/*  15:    */   private String linkUrl;
/*  16:    */   @ApiField("remark")
/*  17:    */   private String remark;
/*  18:    */   @ApiField("sub_contenet")
/*  19:    */   private String subContenet;
/*  20:    */   @ApiField("sub_title")
/*  21:    */   private String subTitle;
/*  22:    */   @ApiField("title")
/*  23:    */   private String title;
/*  24:    */   
/*  25:    */   public String getContent()
/*  26:    */   {
/*  27: 69 */     return this.content;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setContent(String content)
/*  31:    */   {
/*  32: 72 */     this.content = content;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getImageUrl()
/*  36:    */   {
/*  37: 76 */     return this.imageUrl;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setImageUrl(String imageUrl)
/*  41:    */   {
/*  42: 79 */     this.imageUrl = imageUrl;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getLinkUrl()
/*  46:    */   {
/*  47: 83 */     return this.linkUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setLinkUrl(String linkUrl)
/*  51:    */   {
/*  52: 86 */     this.linkUrl = linkUrl;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getRemark()
/*  56:    */   {
/*  57: 90 */     return this.remark;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setRemark(String remark)
/*  61:    */   {
/*  62: 93 */     this.remark = remark;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getSubContenet()
/*  66:    */   {
/*  67: 97 */     return this.subContenet;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setSubContenet(String subContenet)
/*  71:    */   {
/*  72:100 */     this.subContenet = subContenet;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getSubTitle()
/*  76:    */   {
/*  77:104 */     return this.subTitle;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setSubTitle(String subTitle)
/*  81:    */   {
/*  82:107 */     this.subTitle = subTitle;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getTitle()
/*  86:    */   {
/*  87:111 */     return this.title;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setTitle(String title)
/*  91:    */   {
/*  92:114 */     this.title = title;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MedicalSvTpCardBodyInfo
 * JD-Core Version:    0.7.0.1
 */
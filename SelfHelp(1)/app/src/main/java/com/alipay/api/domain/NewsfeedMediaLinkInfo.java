/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class NewsfeedMediaLinkInfo
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6497814962483594529L;
/*  10:    */   @ApiField("content_id")
/*  11:    */   private String contentId;
/*  12:    */   @ApiField("content_source")
/*  13:    */   private String contentSource;
/*  14:    */   @ApiField("content_type")
/*  15:    */   private String contentType;
/*  16:    */   @ApiField("desc")
/*  17:    */   private String desc;
/*  18:    */   @ApiField("thumb")
/*  19:    */   private String thumb;
/*  20:    */   @ApiField("title")
/*  21:    */   private String title;
/*  22:    */   @ApiField("url")
/*  23:    */   private String url;
/*  24:    */   
/*  25:    */   public String getContentId()
/*  26:    */   {
/*  27: 59 */     return this.contentId;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setContentId(String contentId)
/*  31:    */   {
/*  32: 62 */     this.contentId = contentId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getContentSource()
/*  36:    */   {
/*  37: 66 */     return this.contentSource;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setContentSource(String contentSource)
/*  41:    */   {
/*  42: 69 */     this.contentSource = contentSource;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getContentType()
/*  46:    */   {
/*  47: 73 */     return this.contentType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setContentType(String contentType)
/*  51:    */   {
/*  52: 76 */     this.contentType = contentType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getDesc()
/*  56:    */   {
/*  57: 80 */     return this.desc;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setDesc(String desc)
/*  61:    */   {
/*  62: 83 */     this.desc = desc;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getThumb()
/*  66:    */   {
/*  67: 87 */     return this.thumb;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setThumb(String thumb)
/*  71:    */   {
/*  72: 90 */     this.thumb = thumb;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getTitle()
/*  76:    */   {
/*  77: 94 */     return this.title;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setTitle(String title)
/*  81:    */   {
/*  82: 97 */     this.title = title;
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
 * Qualified Name:     com.alipay.api.domain.NewsfeedMediaLinkInfo
 * JD-Core Version:    0.7.0.1
 */
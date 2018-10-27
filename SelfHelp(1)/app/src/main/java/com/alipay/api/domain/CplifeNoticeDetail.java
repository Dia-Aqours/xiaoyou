/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class CplifeNoticeDetail
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 4633654337925875574L;
/*  13:    */   @ApiField("content")
/*  14:    */   private String content;
/*  15:    */   @ApiField("end_time")
/*  16:    */   private Date endTime;
/*  17:    */   @ApiListField("image_list")
/*  18:    */   @ApiField("cplife_notice_img")
/*  19:    */   private List<CplifeNoticeImg> imageList;
/*  20:    */   @ApiField("start_time")
/*  21:    */   private Date startTime;
/*  22:    */   @ApiField("stickied")
/*  23:    */   private Boolean stickied;
/*  24:    */   @ApiField("title")
/*  25:    */   private String title;
/*  26:    */   @ApiField("type")
/*  27:    */   private String type;
/*  28:    */   
/*  29:    */   public String getContent()
/*  30:    */   {
/*  31: 64 */     return this.content;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setContent(String content)
/*  35:    */   {
/*  36: 67 */     this.content = content;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public Date getEndTime()
/*  40:    */   {
/*  41: 71 */     return this.endTime;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setEndTime(Date endTime)
/*  45:    */   {
/*  46: 74 */     this.endTime = endTime;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public List<CplifeNoticeImg> getImageList()
/*  50:    */   {
/*  51: 78 */     return this.imageList;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setImageList(List<CplifeNoticeImg> imageList)
/*  55:    */   {
/*  56: 81 */     this.imageList = imageList;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public Date getStartTime()
/*  60:    */   {
/*  61: 85 */     return this.startTime;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setStartTime(Date startTime)
/*  65:    */   {
/*  66: 88 */     this.startTime = startTime;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public Boolean getStickied()
/*  70:    */   {
/*  71: 92 */     return this.stickied;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setStickied(Boolean stickied)
/*  75:    */   {
/*  76: 95 */     this.stickied = stickied;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getTitle()
/*  80:    */   {
/*  81: 99 */     return this.title;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setTitle(String title)
/*  85:    */   {
/*  86:102 */     this.title = title;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getType()
/*  90:    */   {
/*  91:106 */     return this.type;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setType(String type)
/*  95:    */   {
/*  96:109 */     this.type = type;
/*  97:    */   }
/*  98:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CplifeNoticeDetail
 * JD-Core Version:    0.7.0.1
 */
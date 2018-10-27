/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class PointCard
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 2773312815273982868L;
/* 11:   */   @ApiField("desc")
/* 12:   */   private String desc;
/* 13:   */   @ApiField("end_time")
/* 14:   */   private Date endTime;
/* 15:   */   @ApiField("logo")
/* 16:   */   private String logo;
/* 17:   */   @ApiField("name")
/* 18:   */   private String name;
/* 19:   */   @ApiField("start_time")
/* 20:   */   private Date startTime;
/* 21:   */   @ApiField("type")
/* 22:   */   private String type;
/* 23:   */   
/* 24:   */   public String getDesc()
/* 25:   */   {
/* 26:56 */     return this.desc;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setDesc(String desc)
/* 30:   */   {
/* 31:59 */     this.desc = desc;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public Date getEndTime()
/* 35:   */   {
/* 36:63 */     return this.endTime;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setEndTime(Date endTime)
/* 40:   */   {
/* 41:66 */     this.endTime = endTime;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getLogo()
/* 45:   */   {
/* 46:70 */     return this.logo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setLogo(String logo)
/* 50:   */   {
/* 51:73 */     this.logo = logo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getName()
/* 55:   */   {
/* 56:77 */     return this.name;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setName(String name)
/* 60:   */   {
/* 61:80 */     this.name = name;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public Date getStartTime()
/* 65:   */   {
/* 66:84 */     return this.startTime;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setStartTime(Date startTime)
/* 70:   */   {
/* 71:87 */     this.startTime = startTime;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public String getType()
/* 75:   */   {
/* 76:91 */     return this.type;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void setType(String type)
/* 80:   */   {
/* 81:94 */     this.type = type;
/* 82:   */   }
/* 83:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PointCard
 * JD-Core Version:    0.7.0.1
 */
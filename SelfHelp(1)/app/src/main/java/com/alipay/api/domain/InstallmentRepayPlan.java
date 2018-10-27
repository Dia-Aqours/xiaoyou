/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class InstallmentRepayPlan
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 3728747223898718969L;
/*  11:    */   @ApiField("cur_term")
/*  12:    */   private Boolean curTerm;
/*  13:    */   @ApiField("status")
/*  14:    */   private String status;
/*  15:    */   @ApiField("term_end_date")
/*  16:    */   private Date termEndDate;
/*  17:    */   @ApiField("term_no")
/*  18:    */   private Long termNo;
/*  19:    */   @ApiField("term_nom_int")
/*  20:    */   private String termNomInt;
/*  21:    */   @ApiField("term_nom_prin")
/*  22:    */   private String termNomPrin;
/*  23:    */   @ApiField("term_ovd_int")
/*  24:    */   private String termOvdInt;
/*  25:    */   @ApiField("term_ovd_int_pen_int")
/*  26:    */   private String termOvdIntPenInt;
/*  27:    */   @ApiField("term_ovd_prin")
/*  28:    */   private String termOvdPrin;
/*  29:    */   @ApiField("term_ovd_prin_pen_int")
/*  30:    */   private String termOvdPrinPenInt;
/*  31:    */   @ApiField("term_start_date")
/*  32:    */   private Date termStartDate;
/*  33:    */   
/*  34:    */   public Boolean getCurTerm()
/*  35:    */   {
/*  36: 85 */     return this.curTerm;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setCurTerm(Boolean curTerm)
/*  40:    */   {
/*  41: 88 */     this.curTerm = curTerm;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getStatus()
/*  45:    */   {
/*  46: 92 */     return this.status;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setStatus(String status)
/*  50:    */   {
/*  51: 95 */     this.status = status;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public Date getTermEndDate()
/*  55:    */   {
/*  56: 99 */     return this.termEndDate;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setTermEndDate(Date termEndDate)
/*  60:    */   {
/*  61:102 */     this.termEndDate = termEndDate;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public Long getTermNo()
/*  65:    */   {
/*  66:106 */     return this.termNo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setTermNo(Long termNo)
/*  70:    */   {
/*  71:109 */     this.termNo = termNo;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getTermNomInt()
/*  75:    */   {
/*  76:113 */     return this.termNomInt;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setTermNomInt(String termNomInt)
/*  80:    */   {
/*  81:116 */     this.termNomInt = termNomInt;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getTermNomPrin()
/*  85:    */   {
/*  86:120 */     return this.termNomPrin;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setTermNomPrin(String termNomPrin)
/*  90:    */   {
/*  91:123 */     this.termNomPrin = termNomPrin;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getTermOvdInt()
/*  95:    */   {
/*  96:127 */     return this.termOvdInt;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setTermOvdInt(String termOvdInt)
/* 100:    */   {
/* 101:130 */     this.termOvdInt = termOvdInt;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getTermOvdIntPenInt()
/* 105:    */   {
/* 106:134 */     return this.termOvdIntPenInt;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setTermOvdIntPenInt(String termOvdIntPenInt)
/* 110:    */   {
/* 111:137 */     this.termOvdIntPenInt = termOvdIntPenInt;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getTermOvdPrin()
/* 115:    */   {
/* 116:141 */     return this.termOvdPrin;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTermOvdPrin(String termOvdPrin)
/* 120:    */   {
/* 121:144 */     this.termOvdPrin = termOvdPrin;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTermOvdPrinPenInt()
/* 125:    */   {
/* 126:148 */     return this.termOvdPrinPenInt;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTermOvdPrinPenInt(String termOvdPrinPenInt)
/* 130:    */   {
/* 131:151 */     this.termOvdPrinPenInt = termOvdPrinPenInt;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public Date getTermStartDate()
/* 135:    */   {
/* 136:155 */     return this.termStartDate;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setTermStartDate(Date termStartDate)
/* 140:    */   {
/* 141:158 */     this.termStartDate = termStartDate;
/* 142:    */   }
/* 143:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InstallmentRepayPlan
 * JD-Core Version:    0.7.0.1
 */
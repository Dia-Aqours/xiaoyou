/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class ButtonObject
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6344823677577534672L;
/* 12:   */   @ApiField("action_param")
/* 13:   */   private String actionParam;
/* 14:   */   @ApiField("action_type")
/* 15:   */   private String actionType;
/* 16:   */   @ApiField("name")
/* 17:   */   private String name;
/* 18:   */   @ApiListField("sub_button")
/* 19:   */   @ApiField("sub_button")
/* 20:   */   private List<SubButton> subButton;
/* 21:   */   
/* 22:   */   public String getActionParam()
/* 23:   */   {
/* 24:51 */     return this.actionParam;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setActionParam(String actionParam)
/* 28:   */   {
/* 29:54 */     this.actionParam = actionParam;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getActionType()
/* 33:   */   {
/* 34:58 */     return this.actionType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setActionType(String actionType)
/* 38:   */   {
/* 39:61 */     this.actionType = actionType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getName()
/* 43:   */   {
/* 44:65 */     return this.name;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setName(String name)
/* 48:   */   {
/* 49:68 */     this.name = name;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public List<SubButton> getSubButton()
/* 53:   */   {
/* 54:72 */     return this.subButton;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setSubButton(List<SubButton> subButton)
/* 58:   */   {
/* 59:75 */     this.subButton = subButton;
/* 60:   */   }
/* 61:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ButtonObject

 * JD-Core Version:    0.7.0.1

 */
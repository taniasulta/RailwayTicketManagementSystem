package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Seat {
	
	
	private int id;
	private String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10, s11,s12, s13, s14,s15,s16,s17,s18,s19, s20, s21,s22,s23,s24,s25,s26,s27,s28,s29,s31,s32,s33,s34,s35,s36,s37,s38,s39,s40,s41,s42,s43,s44,s45,s46,s47,s48,s49,s60;
	private String ac1,ac2,ac3,ac4,ac5,ac6,ac7,ac8,ac9,ac10,ac11,ac12,ac13,ac14,ac15,ac16,ac17,ac18,ac19,ac20,ac21,ac22,ac23,ac24,ac25,ac26,ac27,ac28,ac29,ac30,ac31,ac32,ac33,ac34,ac35,ac36,ac37,ac38,ac39,ac40,ac41,ac42,ac43,ac44,ac45,ac46,ac47,ac48,ac49,ac50;
	private String ab1,ab2,ab3,ab4,ab5,ab6,ab7,ab8,ab9,ab10,ab11,ab12,ab13,ab14,ab15,ab16,ab17, ab18,ab19,ab20,ab21,ab22,ab24,ab25,ab26,ab28,ab29,ab30,ab31,ab32,ab33,ab34,ab35,ab36,ab37,ab38,ab39,ab40;
	public Seat() {
		super();
	}
	public Seat(int id, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8,
			String s9, String s10, String s11, String s12, String s13, String s14, String s15, String s16, String s17,
			String s18, String s19, String s20, String s21, String s22, String s23, String s24, String s25, String s26,
			String s27, String s28, String s29, String s31, String s32, String s33, String s34, String s35, String s36,
			String s37, String s38, String s39, String s40, String s41, String s42, String s43, String s44, String s45,
			String s46, String s47, String s48, String s49, String s60, String ac1, String ac2, String ac3, String ac4,
			String ac5, String ac6, String ac7, String ac8, String ac9, String ac10, String ac11, String ac12,
			String ac13, String ac14, String ac15, String ac16, String ac17, String ac18, String ac19, String ac20,
			String ac21, String ac22, String ac23, String ac24, String ac25, String ac26, String ac27, String ac28,
			String ac29, String ac30, String ac31, String ac32, String ac33, String ac34, String ac35, String ac36,
			String ac37, String ac38, String ac39, String ac40, String ac41, String ac42, String ac43, String ac44,
			String ac45, String ac46, String ac47, String ac48, String ac49, String ac50, String ab1, String ab2,
			String ab3, String ab4, String ab5, String ab6, String ab7, String ab8, String ab9, String ab10,
			String ab11, String ab12, String ab13, String ab14, String ab15, String ab16, String ab17, String ab18,
			String ab19, String ab20, String ab21, String ab22, String ab24, String ab25, String ab26, String ab28,
			String ab29, String ab30, String ab31, String ab32, String ab33, String ab34, String ab35, String ab36,
			String ab37, String ab38, String ab39, String ab40) {
		super();
		this.id = id;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
		this.s8 = s8;
		this.s9 = s9;
		this.s10 = s10;
		this.s11 = s11;
		this.s12 = s12;
		this.s13 = s13;
		this.s14 = s14;
		this.s15 = s15;
		this.s16 = s16;
		this.s17 = s17;
		this.s18 = s18;
		this.s19 = s19;
		this.s20 = s20;
		this.s21 = s21;
		this.s22 = s22;
		this.s23 = s23;
		this.s24 = s24;
		this.s25 = s25;
		this.s26 = s26;
		this.s27 = s27;
		this.s28 = s28;
		this.s29 = s29;
		this.s31 = s31;
		this.s32 = s32;
		this.s33 = s33;
		this.s34 = s34;
		this.s35 = s35;
		this.s36 = s36;
		this.s37 = s37;
		this.s38 = s38;
		this.s39 = s39;
		this.s40 = s40;
		this.s41 = s41;
		this.s42 = s42;
		this.s43 = s43;
		this.s44 = s44;
		this.s45 = s45;
		this.s46 = s46;
		this.s47 = s47;
		this.s48 = s48;
		this.s49 = s49;
		this.s60 = s60;
		this.ac1 = ac1;
		this.ac2 = ac2;
		this.ac3 = ac3;
		this.ac4 = ac4;
		this.ac5 = ac5;
		this.ac6 = ac6;
		this.ac7 = ac7;
		this.ac8 = ac8;
		this.ac9 = ac9;
		this.ac10 = ac10;
		this.ac11 = ac11;
		this.ac12 = ac12;
		this.ac13 = ac13;
		this.ac14 = ac14;
		this.ac15 = ac15;
		this.ac16 = ac16;
		this.ac17 = ac17;
		this.ac18 = ac18;
		this.ac19 = ac19;
		this.ac20 = ac20;
		this.ac21 = ac21;
		this.ac22 = ac22;
		this.ac23 = ac23;
		this.ac24 = ac24;
		this.ac25 = ac25;
		this.ac26 = ac26;
		this.ac27 = ac27;
		this.ac28 = ac28;
		this.ac29 = ac29;
		this.ac30 = ac30;
		this.ac31 = ac31;
		this.ac32 = ac32;
		this.ac33 = ac33;
		this.ac34 = ac34;
		this.ac35 = ac35;
		this.ac36 = ac36;
		this.ac37 = ac37;
		this.ac38 = ac38;
		this.ac39 = ac39;
		this.ac40 = ac40;
		this.ac41 = ac41;
		this.ac42 = ac42;
		this.ac43 = ac43;
		this.ac44 = ac44;
		this.ac45 = ac45;
		this.ac46 = ac46;
		this.ac47 = ac47;
		this.ac48 = ac48;
		this.ac49 = ac49;
		this.ac50 = ac50;
		this.ab1 = ab1;
		this.ab2 = ab2;
		this.ab3 = ab3;
		this.ab4 = ab4;
		this.ab5 = ab5;
		this.ab6 = ab6;
		this.ab7 = ab7;
		this.ab8 = ab8;
		this.ab9 = ab9;
		this.ab10 = ab10;
		this.ab11 = ab11;
		this.ab12 = ab12;
		this.ab13 = ab13;
		this.ab14 = ab14;
		this.ab15 = ab15;
		this.ab16 = ab16;
		this.ab17 = ab17;
		this.ab18 = ab18;
		this.ab19 = ab19;
		this.ab20 = ab20;
		this.ab21 = ab21;
		this.ab22 = ab22;
		this.ab24 = ab24;
		this.ab25 = ab25;
		this.ab26 = ab26;
		this.ab28 = ab28;
		this.ab29 = ab29;
		this.ab30 = ab30;
		this.ab31 = ab31;
		this.ab32 = ab32;
		this.ab33 = ab33;
		this.ab34 = ab34;
		this.ab35 = ab35;
		this.ab36 = ab36;
		this.ab37 = ab37;
		this.ab38 = ab38;
		this.ab39 = ab39;
		this.ab40 = ab40;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public String getS3() {
		return s3;
	}
	public void setS3(String s3) {
		this.s3 = s3;
	}
	public String getS4() {
		return s4;
	}
	public void setS4(String s4) {
		this.s4 = s4;
	}
	public String getS5() {
		return s5;
	}
	public void setS5(String s5) {
		this.s5 = s5;
	}
	public String getS6() {
		return s6;
	}
	public void setS6(String s6) {
		this.s6 = s6;
	}
	public String getS7() {
		return s7;
	}
	public void setS7(String s7) {
		this.s7 = s7;
	}
	public String getS8() {
		return s8;
	}
	public void setS8(String s8) {
		this.s8 = s8;
	}
	public String getS9() {
		return s9;
	}
	public void setS9(String s9) {
		this.s9 = s9;
	}
	public String getS10() {
		return s10;
	}
	public void setS10(String s10) {
		this.s10 = s10;
	}
	public String getS11() {
		return s11;
	}
	public void setS11(String s11) {
		this.s11 = s11;
	}
	public String getS12() {
		return s12;
	}
	public void setS12(String s12) {
		this.s12 = s12;
	}
	public String getS13() {
		return s13;
	}
	public void setS13(String s13) {
		this.s13 = s13;
	}
	public String getS14() {
		return s14;
	}
	public void setS14(String s14) {
		this.s14 = s14;
	}
	public String getS15() {
		return s15;
	}
	public void setS15(String s15) {
		this.s15 = s15;
	}
	public String getS16() {
		return s16;
	}
	public void setS16(String s16) {
		this.s16 = s16;
	}
	public String getS17() {
		return s17;
	}
	public void setS17(String s17) {
		this.s17 = s17;
	}
	public String getS18() {
		return s18;
	}
	public void setS18(String s18) {
		this.s18 = s18;
	}
	public String getS19() {
		return s19;
	}
	public void setS19(String s19) {
		this.s19 = s19;
	}
	public String getS20() {
		return s20;
	}
	public void setS20(String s20) {
		this.s20 = s20;
	}
	public String getS21() {
		return s21;
	}
	public void setS21(String s21) {
		this.s21 = s21;
	}
	public String getS22() {
		return s22;
	}
	public void setS22(String s22) {
		this.s22 = s22;
	}
	public String getS23() {
		return s23;
	}
	public void setS23(String s23) {
		this.s23 = s23;
	}
	public String getS24() {
		return s24;
	}
	public void setS24(String s24) {
		this.s24 = s24;
	}
	public String getS25() {
		return s25;
	}
	public void setS25(String s25) {
		this.s25 = s25;
	}
	public String getS26() {
		return s26;
	}
	public void setS26(String s26) {
		this.s26 = s26;
	}
	public String getS27() {
		return s27;
	}
	public void setS27(String s27) {
		this.s27 = s27;
	}
	public String getS28() {
		return s28;
	}
	public void setS28(String s28) {
		this.s28 = s28;
	}
	public String getS29() {
		return s29;
	}
	public void setS29(String s29) {
		this.s29 = s29;
	}
	public String getS31() {
		return s31;
	}
	public void setS31(String s31) {
		this.s31 = s31;
	}
	public String getS32() {
		return s32;
	}
	public void setS32(String s32) {
		this.s32 = s32;
	}
	public String getS33() {
		return s33;
	}
	public void setS33(String s33) {
		this.s33 = s33;
	}
	public String getS34() {
		return s34;
	}
	public void setS34(String s34) {
		this.s34 = s34;
	}
	public String getS35() {
		return s35;
	}
	public void setS35(String s35) {
		this.s35 = s35;
	}
	public String getS36() {
		return s36;
	}
	public void setS36(String s36) {
		this.s36 = s36;
	}
	public String getS37() {
		return s37;
	}
	public void setS37(String s37) {
		this.s37 = s37;
	}
	public String getS38() {
		return s38;
	}
	public void setS38(String s38) {
		this.s38 = s38;
	}
	public String getS39() {
		return s39;
	}
	public void setS39(String s39) {
		this.s39 = s39;
	}
	public String getS40() {
		return s40;
	}
	public void setS40(String s40) {
		this.s40 = s40;
	}
	public String getS41() {
		return s41;
	}
	public void setS41(String s41) {
		this.s41 = s41;
	}
	public String getS42() {
		return s42;
	}
	public void setS42(String s42) {
		this.s42 = s42;
	}
	public String getS43() {
		return s43;
	}
	public void setS43(String s43) {
		this.s43 = s43;
	}
	public String getS44() {
		return s44;
	}
	public void setS44(String s44) {
		this.s44 = s44;
	}
	public String getS45() {
		return s45;
	}
	public void setS45(String s45) {
		this.s45 = s45;
	}
	public String getS46() {
		return s46;
	}
	public void setS46(String s46) {
		this.s46 = s46;
	}
	public String getS47() {
		return s47;
	}
	public void setS47(String s47) {
		this.s47 = s47;
	}
	public String getS48() {
		return s48;
	}
	public void setS48(String s48) {
		this.s48 = s48;
	}
	public String getS49() {
		return s49;
	}
	public void setS49(String s49) {
		this.s49 = s49;
	}
	public String getS60() {
		return s60;
	}
	public void setS60(String s60) {
		this.s60 = s60;
	}
	public String getAc1() {
		return ac1;
	}
	public void setAc1(String ac1) {
		this.ac1 = ac1;
	}
	public String getAc2() {
		return ac2;
	}
	public void setAc2(String ac2) {
		this.ac2 = ac2;
	}
	public String getAc3() {
		return ac3;
	}
	public void setAc3(String ac3) {
		this.ac3 = ac3;
	}
	public String getAc4() {
		return ac4;
	}
	public void setAc4(String ac4) {
		this.ac4 = ac4;
	}
	public String getAc5() {
		return ac5;
	}
	public void setAc5(String ac5) {
		this.ac5 = ac5;
	}
	public String getAc6() {
		return ac6;
	}
	public void setAc6(String ac6) {
		this.ac6 = ac6;
	}
	public String getAc7() {
		return ac7;
	}
	public void setAc7(String ac7) {
		this.ac7 = ac7;
	}
	public String getAc8() {
		return ac8;
	}
	public void setAc8(String ac8) {
		this.ac8 = ac8;
	}
	public String getAc9() {
		return ac9;
	}
	public void setAc9(String ac9) {
		this.ac9 = ac9;
	}
	public String getAc10() {
		return ac10;
	}
	public void setAc10(String ac10) {
		this.ac10 = ac10;
	}
	public String getAc11() {
		return ac11;
	}
	public void setAc11(String ac11) {
		this.ac11 = ac11;
	}
	public String getAc12() {
		return ac12;
	}
	public void setAc12(String ac12) {
		this.ac12 = ac12;
	}
	public String getAc13() {
		return ac13;
	}
	public void setAc13(String ac13) {
		this.ac13 = ac13;
	}
	public String getAc14() {
		return ac14;
	}
	public void setAc14(String ac14) {
		this.ac14 = ac14;
	}
	public String getAc15() {
		return ac15;
	}
	public void setAc15(String ac15) {
		this.ac15 = ac15;
	}
	public String getAc16() {
		return ac16;
	}
	public void setAc16(String ac16) {
		this.ac16 = ac16;
	}
	public String getAc17() {
		return ac17;
	}
	public void setAc17(String ac17) {
		this.ac17 = ac17;
	}
	public String getAc18() {
		return ac18;
	}
	public void setAc18(String ac18) {
		this.ac18 = ac18;
	}
	public String getAc19() {
		return ac19;
	}
	public void setAc19(String ac19) {
		this.ac19 = ac19;
	}
	public String getAc20() {
		return ac20;
	}
	public void setAc20(String ac20) {
		this.ac20 = ac20;
	}
	public String getAc21() {
		return ac21;
	}
	public void setAc21(String ac21) {
		this.ac21 = ac21;
	}
	public String getAc22() {
		return ac22;
	}
	public void setAc22(String ac22) {
		this.ac22 = ac22;
	}
	public String getAc23() {
		return ac23;
	}
	public void setAc23(String ac23) {
		this.ac23 = ac23;
	}
	public String getAc24() {
		return ac24;
	}
	public void setAc24(String ac24) {
		this.ac24 = ac24;
	}
	public String getAc25() {
		return ac25;
	}
	public void setAc25(String ac25) {
		this.ac25 = ac25;
	}
	public String getAc26() {
		return ac26;
	}
	public void setAc26(String ac26) {
		this.ac26 = ac26;
	}
	public String getAc27() {
		return ac27;
	}
	public void setAc27(String ac27) {
		this.ac27 = ac27;
	}
	public String getAc28() {
		return ac28;
	}
	public void setAc28(String ac28) {
		this.ac28 = ac28;
	}
	public String getAc29() {
		return ac29;
	}
	public void setAc29(String ac29) {
		this.ac29 = ac29;
	}
	public String getAc30() {
		return ac30;
	}
	public void setAc30(String ac30) {
		this.ac30 = ac30;
	}
	public String getAc31() {
		return ac31;
	}
	public void setAc31(String ac31) {
		this.ac31 = ac31;
	}
	public String getAc32() {
		return ac32;
	}
	public void setAc32(String ac32) {
		this.ac32 = ac32;
	}
	public String getAc33() {
		return ac33;
	}
	public void setAc33(String ac33) {
		this.ac33 = ac33;
	}
	public String getAc34() {
		return ac34;
	}
	public void setAc34(String ac34) {
		this.ac34 = ac34;
	}
	public String getAc35() {
		return ac35;
	}
	public void setAc35(String ac35) {
		this.ac35 = ac35;
	}
	public String getAc36() {
		return ac36;
	}
	public void setAc36(String ac36) {
		this.ac36 = ac36;
	}
	public String getAc37() {
		return ac37;
	}
	public void setAc37(String ac37) {
		this.ac37 = ac37;
	}
	public String getAc38() {
		return ac38;
	}
	public void setAc38(String ac38) {
		this.ac38 = ac38;
	}
	public String getAc39() {
		return ac39;
	}
	public void setAc39(String ac39) {
		this.ac39 = ac39;
	}
	public String getAc40() {
		return ac40;
	}
	public void setAc40(String ac40) {
		this.ac40 = ac40;
	}
	public String getAc41() {
		return ac41;
	}
	public void setAc41(String ac41) {
		this.ac41 = ac41;
	}
	public String getAc42() {
		return ac42;
	}
	public void setAc42(String ac42) {
		this.ac42 = ac42;
	}
	public String getAc43() {
		return ac43;
	}
	public void setAc43(String ac43) {
		this.ac43 = ac43;
	}
	public String getAc44() {
		return ac44;
	}
	public void setAc44(String ac44) {
		this.ac44 = ac44;
	}
	public String getAc45() {
		return ac45;
	}
	public void setAc45(String ac45) {
		this.ac45 = ac45;
	}
	public String getAc46() {
		return ac46;
	}
	public void setAc46(String ac46) {
		this.ac46 = ac46;
	}
	public String getAc47() {
		return ac47;
	}
	public void setAc47(String ac47) {
		this.ac47 = ac47;
	}
	public String getAc48() {
		return ac48;
	}
	public void setAc48(String ac48) {
		this.ac48 = ac48;
	}
	public String getAc49() {
		return ac49;
	}
	public void setAc49(String ac49) {
		this.ac49 = ac49;
	}
	public String getAc50() {
		return ac50;
	}
	public void setAc50(String ac50) {
		this.ac50 = ac50;
	}
	public String getAb1() {
		return ab1;
	}
	public void setAb1(String ab1) {
		this.ab1 = ab1;
	}
	public String getAb2() {
		return ab2;
	}
	public void setAb2(String ab2) {
		this.ab2 = ab2;
	}
	public String getAb3() {
		return ab3;
	}
	public void setAb3(String ab3) {
		this.ab3 = ab3;
	}
	public String getAb4() {
		return ab4;
	}
	public void setAb4(String ab4) {
		this.ab4 = ab4;
	}
	public String getAb5() {
		return ab5;
	}
	public void setAb5(String ab5) {
		this.ab5 = ab5;
	}
	public String getAb6() {
		return ab6;
	}
	public void setAb6(String ab6) {
		this.ab6 = ab6;
	}
	public String getAb7() {
		return ab7;
	}
	public void setAb7(String ab7) {
		this.ab7 = ab7;
	}
	public String getAb8() {
		return ab8;
	}
	public void setAb8(String ab8) {
		this.ab8 = ab8;
	}
	public String getAb9() {
		return ab9;
	}
	public void setAb9(String ab9) {
		this.ab9 = ab9;
	}
	public String getAb10() {
		return ab10;
	}
	public void setAb10(String ab10) {
		this.ab10 = ab10;
	}
	public String getAb11() {
		return ab11;
	}
	public void setAb11(String ab11) {
		this.ab11 = ab11;
	}
	public String getAb12() {
		return ab12;
	}
	public void setAb12(String ab12) {
		this.ab12 = ab12;
	}
	public String getAb13() {
		return ab13;
	}
	public void setAb13(String ab13) {
		this.ab13 = ab13;
	}
	public String getAb14() {
		return ab14;
	}
	public void setAb14(String ab14) {
		this.ab14 = ab14;
	}
	public String getAb15() {
		return ab15;
	}
	public void setAb15(String ab15) {
		this.ab15 = ab15;
	}
	public String getAb16() {
		return ab16;
	}
	public void setAb16(String ab16) {
		this.ab16 = ab16;
	}
	public String getAb17() {
		return ab17;
	}
	public void setAb17(String ab17) {
		this.ab17 = ab17;
	}
	public String getAb18() {
		return ab18;
	}
	public void setAb18(String ab18) {
		this.ab18 = ab18;
	}
	public String getAb19() {
		return ab19;
	}
	public void setAb19(String ab19) {
		this.ab19 = ab19;
	}
	public String getAb20() {
		return ab20;
	}
	public void setAb20(String ab20) {
		this.ab20 = ab20;
	}
	public String getAb21() {
		return ab21;
	}
	public void setAb21(String ab21) {
		this.ab21 = ab21;
	}
	public String getAb22() {
		return ab22;
	}
	public void setAb22(String ab22) {
		this.ab22 = ab22;
	}
	public String getAb24() {
		return ab24;
	}
	public void setAb24(String ab24) {
		this.ab24 = ab24;
	}
	public String getAb25() {
		return ab25;
	}
	public void setAb25(String ab25) {
		this.ab25 = ab25;
	}
	public String getAb26() {
		return ab26;
	}
	public void setAb26(String ab26) {
		this.ab26 = ab26;
	}
	public String getAb28() {
		return ab28;
	}
	public void setAb28(String ab28) {
		this.ab28 = ab28;
	}
	public String getAb29() {
		return ab29;
	}
	public void setAb29(String ab29) {
		this.ab29 = ab29;
	}
	public String getAb30() {
		return ab30;
	}
	public void setAb30(String ab30) {
		this.ab30 = ab30;
	}
	public String getAb31() {
		return ab31;
	}
	public void setAb31(String ab31) {
		this.ab31 = ab31;
	}
	public String getAb32() {
		return ab32;
	}
	public void setAb32(String ab32) {
		this.ab32 = ab32;
	}
	public String getAb33() {
		return ab33;
	}
	public void setAb33(String ab33) {
		this.ab33 = ab33;
	}
	public String getAb34() {
		return ab34;
	}
	public void setAb34(String ab34) {
		this.ab34 = ab34;
	}
	public String getAb35() {
		return ab35;
	}
	public void setAb35(String ab35) {
		this.ab35 = ab35;
	}
	public String getAb36() {
		return ab36;
	}
	public void setAb36(String ab36) {
		this.ab36 = ab36;
	}
	public String getAb37() {
		return ab37;
	}
	public void setAb37(String ab37) {
		this.ab37 = ab37;
	}
	public String getAb38() {
		return ab38;
	}
	public void setAb38(String ab38) {
		this.ab38 = ab38;
	}
	public String getAb39() {
		return ab39;
	}
	public void setAb39(String ab39) {
		this.ab39 = ab39;
	}
	public String getAb40() {
		return ab40;
	}
	public void setAb40(String ab40) {
		this.ab40 = ab40;
	}
	
	
}

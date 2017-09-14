package com.flag;

import java.util.ArrayList;
import java.util.List;

public enum CampiFlag {
				flag_BD("flag_BD")
				,M_noteBD_flag("M_noteBD_flag")
		  	  ,M_period_cong("M_period_cong")
		      ,M_BD_FlagGmin("M_BD_FlagGmin")
		      ,dt_riferimento("dt_riferimento")
		      ,dt_agg("dt_agg")
		      ,vers("vers")
		      ,versione_descr("versione_descr")
		      ,cdg_fondo("cdg_fondo")
		      ,descr_fondo("descr_fondo")
		      ,cdg_cliente("cdg_cliente")
		      ,descr_cliente("descr_cliente")
		      ,tipo_fondo("tipo_fondo")
		      ,M_BD_controlli_dtDa("M_BD_controlli_dtDa")
		      ,M_BD_controlli_dtA("M_BD_controlli_dtA")
		      ,M_BD_controlli("M_BD_controlli")
		      ,M_BD_controlli_minimo("M_BD_controlli_minimo")
		      ,M_BD_cnt_aliq_val("M_BD_cnt_aliq_val")
		      ,M_BD_cnt_Fisso("M_BD_cnt_Fisso")
		      ,M_BD_cnt_cus_min("M_BD_cnt_cus_min")
		      ,M_BD_custodia_dtDa("M_BD_custodia_dtDa")
		      ,M_BD_custodia_dtA("M_BD_custodia_dtA")
		      ,M_BD_custodia("M_BD_custodia")
		      ,M_BD_custodia_minimo("M_BD_custodia_minimo")
		      ,M_BD_cus_n_comp("M_BD_cus_n_comp")
		      ,M_BD_cus_fisso("M_BD_cus_fisso")
		      ,M_BD_cus_aliq_val("M_BD_cus_aliq_val")
		      ,M_BD_regolamento_dtDA("M_BD_regolamento_dtDA")
		      ,M_BD_regolamento_dtA("M_BD_regolamento_dtA")
		      ,M_BD_regolamento("M_BD_regolamento")
		      ,M_BD_regolamento_minimo("M_BD_regolamento_minimo")
		      ,M_BD_reg_costo_ass("M_BD_reg_costo_ass")
		      ,M_BD_reg_costo_bon("M_BD_reg_costo_bon")
		      ,M_BD_reg_costo_titITA("M_BD_reg_costo_titITA")
		      ,M_BD_reg_costo_titEST("M_BD_reg_costo_titEST")
		      ,M_BD_reg_costo_oblITA("M_BD_reg_costo_oblITA")
		      ,M_BD_reg_costo_oblEST("M_BD_reg_costo_oblEST")
		      ,M_BD_reg_costo_fisso("M_BD_reg_costo_fisso")
		      ,M_BD_val_patr_dtDa("M_BD_val_patr_dtDa")
		      ,M_BD_val_patr_dtA("M_BD_val_patr_dtA")
		      ,M_BD_val_patr("M_BD_val_patr")
		      ,M_BD_val_patr_minimo("M_BD_val_patr_minimo")
		      ,M_BD_val_patr_ALIQ("M_BD_val_patr_ALIQ")
		      ,M_BD_val_patr_ANNUO("M_BD_val_patr_ANNUO")
		      ,M_BD_val_patr_MENSILE("M_BD_val_patr_MENSILE")
		      ,M_BD_val_patr_MIN("M_BD_val_patr_MIN")
		      ,M_BD_GATE_base_dtDa("M_BD_GATE_base_dtDa")
		      ,M_BD_GATE_base_dtA("M_BD_GATE_base_dtA")
		      ,M_BD_GATE_base("M_BD_GATE_base")
		      ,M_BD_GATE_base_minimo("M_BD_GATE_base_minimo")
		      ,M_BD_gate_base_ALIQ("M_BD_gate_base_ALIQ")
		      ,M_BD_gate_base_ANNUO("M_BD_gate_base_ANNUO")
		      ,M_BD_gate_base_MENSILE("M_BD_gate_base_MENSILE")
		      ,M_BD_gate_base_MIN("M_BD_gate_base_MIN")
		      ,M_BD_gate_avanzato_dtDa("M_BD_gate_avanzato_dtDa")
		      ,M_BD_gate_avanzato_dtA("M_BD_gate_avanzato_dtA")
		      ,M_BD_gate_avanzato("M_BD_gate_avanzato")
		      ,M_BD_gate_avanzato_minimo("M_BD_gate_avanzato_minimo")
		      ,M_BD_gate_avanzato_ALIQ("M_BD_gate_avanzato_ALIQ")
		      ,M_BD_gate_avanzato_ANNUO("M_BD_gate_avanzato_ANNUO")
		      ,M_BD_gate_avanzato_MENSILE("M_BD_gate_avanzato_MENSILE")
		      ,M_BD_gate_avanzato_MIN("M_BD_gate_avanzato_MIN")
		      ,M_BD_secur_lend_dt_inizio_serv("M_BD_secur_lend_dt_inizio_serv")
		      ,M_BD_secur_lend_dt_fine_serv("M_BD_secur_lend_dt_fine_serv")
		      ,M_BD_secur_lend_rule("M_BD_secur_lend_rule")
		      ,M_BD_secur_lend_rule_minimo("M_BD_secur_lend_rule_minimo")
		      ,M_BD_secur_lend_aliquota("M_BD_secur_lend_aliquota")
		      ,M_BD_secur_lend_ANNUO("M_BD_secur_lend_ANNUO")
		      ,M_BD_secur_lend_MENSILE("M_BD_secur_lend_MENSILE")
		      ,M_BD_secur_lend_mensile_minimo("M_BD_secur_lend_mensile_minimo")
		      ,M_BD_oneri_fin_dt_inizio_serv("M_BD_oneri_fin_dt_inizio_serv")
		      ,M_BD_oneri_fin_dt_fine_serv("M_BD_oneri_fin_dt_fine_serv")
		      ,M_BD_oneri_fin_rule("M_BD_oneri_fin_rule")
		      ,M_BD_oneri_fin_rule_minimo("M_BD_oneri_fin_rule_minimo")
		      ,M_BD_oneri_fin_aliquota("M_BD_oneri_fin_aliquota")
		      ,M_BD_oneri_fin_ANNUO("M_BD_oneri_fin_ANNUO")
		      ,M_BD_oneri_fin_MENSILE("M_BD_oneri_fin_MENSILE")
		      ,M_BD_oneri_fin_mensile_minimo("M_BD_oneri_fin_mensile_minimo")
		      ,M_BD_oneri_div_dt_inizio_serv("M_BD_oneri_div_dt_inizio_serv")
		      ,M_BD_oneri_div_dt_dive_serv("M_BD_oneri_div_dt_dive_serv")
		      ,M_BD_oneri_div_rule("M_BD_oneri_div_rule")
		      ,M_BD_oneri_div_rule_minimo("M_BD_oneri_div_rule_minimo")
		      ,M_BD_oneri_div_aliquota("M_BD_oneri_div_aliquota")
		      ,M_BD_oneri_div_ANNUO("M_BD_oneri_div_ANNUO")
		      ,M_M_BD_oneri_div_MENSILE("M_M_BD_oneri_div_MENSILE")
		      ,M_M_BD_oneri_div_mensile_minimo("M_M_BD_oneri_div_mensile_minimo")
		      ,M_BD_inter_neg_dtDa("M_BD_inter_neg_dtDa")
		      ,M_BD_inter_neg_dtA("M_BD_inter_neg_dtA")
		      ,M_BD_inter_neg("M_BD_inter_neg")
		      ,M_BD_inter_neg_minimo("M_BD_inter_neg_minimo")
		      ,M_BD_inter_neg_ALIQ("M_BD_inter_neg_ALIQ")
		      ,M_BD_inter_neg_ANNUO("M_BD_inter_neg_ANNUO")
		      ,M_BD_inter_neg_MENSILE("M_BD_inter_neg_MENSILE")
		      ,M_BD_inter_neg_MIN("M_BD_inter_neg_MIN")
		      ,M_BD_controlli_iva("M_BD_controlli_iva")
		      ,M_BD_custodia_iva("M_BD_custodia_iva")
		      ,M_BD_regolamento_iva("M_BD_regolamento_iva")
		      ,M_BD_valPatr_iva("M_BD_valPatr_iva")
		      ,M_BD_gateBase_iva("M_BD_gateBase_iva")
		      ,M_BD_gateAvanzato_iva("M_BD_gateAvanzato_iva")
		      ,M_BD_secur_lend_iva("M_BD_secur_lend_iva")
		      ,M_BD_oneri_fin_iva("M_BD_oneri_fin_iva")
		      ,M_BD_oneri_div_iva("M_BD_oneri_div_iva")
		      ,M_BD_iva_inter_neg("M_BD_iva_inter_neg")
		      ,M_calc_12("M_calc_12")
		      ,mm_full("mm_full")
		      ,mm_no_full("mm_no_full")
		      ,day_mm("day_mm")
		      ,fatt_calc("fatt_calc");
	
	private String value;

	private CampiFlag(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static List<CampiFlag> getListaCampiControlli() {

		List<CampiFlag> listaFlagControlli = new ArrayList<>();
		listaFlagControlli.add(M_BD_controlli_dtDa);
		listaFlagControlli.add(M_BD_controlli_dtA);
		listaFlagControlli.add(M_BD_controlli);
		listaFlagControlli.add(M_BD_controlli_minimo);
		listaFlagControlli.add(M_BD_cnt_aliq_val);
		listaFlagControlli.add(M_BD_cnt_Fisso);
		listaFlagControlli.add(M_BD_cnt_cus_min);

		return listaFlagControlli;

	}

	public static List<CampiFlag> getListaCampiFlagPadreInizio() {

		List<CampiFlag> listaCampiFlagGenericiInizio = new ArrayList<>();

		listaCampiFlagGenericiInizio.add(flag_BD);
		listaCampiFlagGenericiInizio.add(M_noteBD_flag);
		listaCampiFlagGenericiInizio.add(M_period_cong);
		listaCampiFlagGenericiInizio.add(M_BD_FlagGmin);
		listaCampiFlagGenericiInizio.add(dt_riferimento);
		listaCampiFlagGenericiInizio.add(dt_agg);
		listaCampiFlagGenericiInizio.add(vers);
		listaCampiFlagGenericiInizio.add(versione_descr);
		listaCampiFlagGenericiInizio.add(cdg_fondo);
		listaCampiFlagGenericiInizio.add(descr_fondo);
		listaCampiFlagGenericiInizio.add(cdg_cliente);
		listaCampiFlagGenericiInizio.add(descr_cliente);
		listaCampiFlagGenericiInizio.add(tipo_fondo);

		return listaCampiFlagGenericiInizio;
	}
	
	/**
	 * utile per le query
	 * 
	 * @return lista contenente i campi della tabella padre
	 * 	 da mettere infondo alle tabelle figlie
	 */
	public static  List<CampiFlag> getListaCampiFlagPadreFine() {

		List<CampiFlag> listaCampiFlagPadreFine = new ArrayList<>();
		
		listaCampiFlagPadreFine.add(M_calc_12);
		listaCampiFlagPadreFine.add(mm_full);
		listaCampiFlagPadreFine.add(mm_no_full);
		listaCampiFlagPadreFine.add(day_mm);
		listaCampiFlagPadreFine.add(fatt_calc);
		return listaCampiFlagPadreFine;
}
	
	
	
}

export class Rdv {
    num_Rdv: number;
    date_rdv: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    heure_rdv: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    centre: {
        periode_rdv: number;
        bornInfAttente: string;
        bornSupAttente: string;
        designationAr: string;
        date_Create: number;
      //  code: number;
        actif: number;
        codenatureCentre: number;
        code : Number;
        code_Service: number;
        user_Create: string
    };
    code_salle: number;
    demande_examen: {
        code_demande: number;
        nature: number;
        observation: string;
        planifier: number;
        code_service_demandeur: number;
        nom_medecin_autre: number;
        has_det_payer: number;
        nbreSeance: number;
        nbreSeanceParJour: number;
        _frequenceSeance: number;
        code_patient: number;
        code_etat_demande: number;
        demande_multi_seance: number;
        medecin_prescripteur: {
            dateEmbauche: number;
            code: number;
            actif: number;
            isOPD: number;
            codePrestationConsultation: number;
            isChirugien: number;
            nomInterv: string;
            tauxTaxe: number;
            codeDegre: number;
            codeSaisie: string;
            tauxAssurance: number;
            delaisControle: number;
            dureeConsultation: number;
            codeSpecialite: number;
            codeTypeIntervenant: number;
            permisControle: number;
            nbrPlaceReservation: number;
            permisAdmission: number;
            userCreate: string;
            nomIntervAr: string;
            dateCreate: number;
            facturation: number
        };
        degre_demande: {
            code: number;
            designation: string;
            designation_ar: string
        };
        date_Create: {
            year: number;
            month: string;
            dayOfMonth: number;
            dayOfWeek: string;
            era: string;
            dayOfYear: number;
            leapYear: number;
            chronology: {
                id: string;
                calendarType: string
            };
            monthValue: number
        };
        admission: {
            code: string;
            code_patient: string;
            nom_ar: string;
            prenom_ar: string;
            pere_ar: string;
            grand_pere_ar: string;
            nom_complet_ar: string;
            nom_en: string;
            prenom_en: string;
            pere_en: string;
            grand_pere_en: string;
            nom_complet_en: string;
            nom_ar_brut: string;
            date_naissance: number;
            sexe: string;
            code_nat: number;
            type_pi: number;
            num_pi: string;
            date_pi: string;
            tel: string;
            adresse: string;
            code_cabinet: number;
            code_reservation_opd: number;
            num_seq: number;
            num_soc: number;
            code_price_list: number;
            code_lit: string;
            code_etat_patient_opd: number;
            code_service: number;
            code_type_arrivee: number;
            code_medecin_correspondant: number;
            code_motif: number;
            _montant_avance_exige: number;
            code_categorie_chambre: number;
            date_dep_prevue: number;
            heure_dep_prevue: number;
            receptionniste: string;
            nom_engagement: string;
            type_pi_engagement: number;
            _numero_pi_engagement: string;
            date_pi_engagement: number;
            telephone_engagement: string;
            code_lien_parente: number;
            code_planning_cabinet: number;
            date_arrivee: number;
            heure_arrivee: number;
            code_region: number;
            photo: string;
            is_autorised: number;
            convention: null;
            medecin_traitant: {
                dateEmbauche: number;
                code: number;
                actif: number;
                isOPD: number;
                codePrestationConsultation: number;
                isChirugien: number;
                nomInterv: string;
                tauxTaxe: number;
                codeDegre: number;
                codeSaisie: string;
                tauxAssurance: number;
                delaisControle: number;
                dureeConsultation: number;
                codeSpecialite: number;
                codeTypeIntervenant: number;
                permisControle: number;
                nbrPlaceReservation: number;
                permisAdmission: number;
                userCreate: string;
                nomIntervAr: string;
                dateCreate: number;
                facturation: number
            };
            codenature_admission: {
                logo: string;
                montant_trop_percu: number;
                montant_moin_percu: number;
                date_Create: {
                    dayOfMonth: number;
                    dayOfWeek: string;
                    dayOfYear: number;
                    month: string;
                    year: number;
                    hour: number;
                    minute: number;
                    nano: number;
                    second: number;
                    monthValue: number;
                    chronology: {
                        id: string;
                        calendarType: string
                    }
                };
                code: number;
                actif: number;
                user_Create: string;
                designation: string;
                designation_Ar: string
            }
        };
        user_Create: string
    };
    nom_ar: string;
    prenom_ar: string;
    pere_ar: string;
    grand_pere_ar: string;
    nom_complet_ar: string;
    nom_en: string;
    prenom_en: string;
    pere_en: string;
    grand_pere_en: string;
    nom_complet_en: string;
    nom_ar_brut: string;
    code_medecin: number;
    facturer: number;
    arrivee_centre: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    duree_examen: number;
    code_admission: string;
    code_patient: string;
    rdv_sans_admission: number;
    valide: number;
    image_archive: number;
    code_multi_seance: number;
    date_Create: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    duree: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    sexe: string;
    user_Create: string;
    dateNaissance: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    num_Quittance: string;
    sortie_Salle: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    entree_Salle: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    etat_examen_patient: {
        code: number;
        designation_ar: string;
        designation_en: string;
    sortie_Salle_Manuelle: String;
    user_Entree_Salle: string;
    etat_attente_finale: number;
    code_Technicien: number;
    entree_Salle_Manuelle: {
        dayOfMonth: number;
        dayOfWeek: string;
        dayOfYear: number;
        month: string;
        year: number;
        hour: number;
        minute: number;
        nano: number;
        second: number;
        monthValue: number;
        chronology: {
            id: string;
            calendarType: string
        }
    };
    user_validation: string;
    user_Sortie_Salle: string;
    date_validation: {
        dayOfMonth: number,
        dayOfWeek: string,
        dayOfYear: number,
        month: string,
        year: number,
        hour: number,
        minute: number,
        nano: number,
        second: number,
        monthValue: number,
        chronology: {
            id: string,
            calendarType: string
        }
    };
    heure_validation:  {
        dayOfMonth: number,
        dayOfWeek: string,
        dayOfYear: number,
        month: string,
        year: number,
        hour: number,
        minute: number,
        nano: number,
        second: number,
        monthValue: number,
        chronology: {
            id: string,
            calendarType: string
        }
    }
};
}

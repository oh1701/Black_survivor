package com.example.black_survivor_dictinary

import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.black_survivor_dictinary.databinding.ActivityItemBinding

class Item : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val check = findViewById<CheckBox>(R.id.check1)
        var a : Int = 0
        binding.edit
        binding.weaponClick
        binding.specialClick
        binding.gearClick
        binding.consumeClick

        binding.weaponClick.setOnClickListener(){
            Toast.makeText(this, "체크되었씁나유", Toast.LENGTH_SHORT).show()
        }

        val ItemList = arrayListOf(
                Item_list("머리띠", R.drawable.head_hairband, "모자", R.drawable.head_hat, "자전거 헬멧", R.drawable.head_bike_helmet, "가면", R.drawable.head_mask),
                Item_list("머리테", R.drawable.head_circlet, "베레모", R.drawable.head_beret, "사슬 코이프", R.drawable.head_chain_coif, "안전모", R.drawable.head_safety_helmet),
                Item_list("방탄모", R.drawable.head_head_ballistic_helmet, "소방헬멧", R.drawable.head_fire_helmet, "티아라", R.drawable.head_tiara, "왕관", R.drawable.head_crown),
                Item_list("투구", R.drawable.head_close_helm, "오토바이 헬멧", R.drawable.head_motorcycle_helmet, "수정 티아라", R.drawable.head_crystal_tiara, "미스릴 투구", R.drawable.head_mithril_helm),
                Item_list("전술-OPS 헬멧", R.drawable.head_tactical_ops_helmet, "기사단장의 투구", R.drawable.head_helm_of_banneret, "변검", R.drawable.head_chinese_opera_mask, "제국 왕관", R.drawable.head_imperial_crown),
                Item_list("황실 부르고넷", R.drawable.head_imperial_burgonet, "월계관", R.drawable.head_laurel_wreath,/*여기까지 머리*/ "바람막이", R.drawable.clothes_windbreaker, "승복", R.drawable.clothes_monk_robe),
                Item_list("전신 수영복", R.drawable.clothes_full_body_swimsuit, "천 갑옷", R.drawable.clothes_fabric_armor, "가죽 갑옷", R.drawable.clothes_leather_armor, "가죽 자켓", R.drawable.clothes_leather_jacker)
                ,Item_list("거북 도북", R.drawable.clothes_turtle_dobok, "군복", R.drawable.clothes_military_suit, "덧댄 로브", R.drawable.clothes_patched_robe, "드레스", R.drawable.clothes_dress)
                ,Item_list("비키니", R.drawable.clothes_bikini, "잠수복", R.drawable.clothes_diving_suit, "라이더 자켓", R.drawable.clothes_rider_jacket, "사슬 갑옷", R.drawable.clothes_chain_armor)
                ,Item_list("정장", R.drawable.clothes_suit, "치파오", R.drawable.clothes_qipao, "판금 갑옷", R.drawable.clothes_sheet_metal_armor, "한복", R.drawable.clothes_hanbok)
                ,Item_list("방탄 조끼", R.drawable.clothes_bulletproof_vest, "석양의 갑옷", R.drawable.clothes_sunset_armor, "어사의", R.drawable.clothes_covert_agent_uniform, "광학미채 슈트", R.drawable.clothes_optical_camouflage_suit)
                ,Item_list("락커의 자켓", R.drawable.clothes_rocker_jacket, "미스릴 갑옷", R.drawable.clothes_mithril_armor, "성기사의 갑옷", R.drawable.clothes_crusader_armor, "아마조네스 아머", R.drawable.clothes_amazoness_armor)
                ,Item_list("용의 도복", R.drawable.clothes_dragon_dobok, "지휘관의 갑옷", R.drawable.clothes_commander_armor, "집사복", R.drawable.clothes_butler_suit, "배틀 슈트", R.drawable.clothes_battle_suit)
                ,Item_list("EOD 슈트", R.drawable.clothes_eod_suit, "불꽃 드레스", R.drawable.clothes_blazing_dress, "카바나", R.drawable.clothes_kabana, "퀸 오브 하트", R.drawable.queen_of_hearts)/*여기까지 옷*/
                ,Item_list("손목시계", R.drawable.hands_watch, "붕대", R.drawable.hands_bandage, "팔찌", R.drawable.hands_bracelet,"가죽 방패", R.drawable.hands_leather_shield)
                ,Item_list("분대장 완장", R.drawable.hands_squad_leader_armband,"브레이서", R.drawable.hands_bracer, "검집", R.drawable.hands_sheath,"금팔찌", R.drawable.hands_golden_bracelet)
                ,Item_list("바주반드", R.drawable.hands_bazuband,"진홍 팔찌", R.drawable.hands_crimson_bracelet, "강철 방패", R.drawable.hands_steel_shield, "큐브 워치", R.drawable.hands_cube_watch)
                ,Item_list( "소드 스토퍼", R.drawable.hands_sword_stopper,"미스릴 방패", R.drawable.hands_mithril_shield, "바이탈 센서", R.drawable.hands_vital_sign_sensor, "기사의 신조", R.drawable.hands_creed_of_the_knight)
                ,Item_list( "샤자한의 검집", R.drawable.clothes_blazing_dress, "드라우프니르", R.drawable.clothes_kabana, "스카디의 팔찌", R.drawable.queen_of_hearts, "레이더", R.drawable.clothes_eod_suit)
                ,Item_list( "오토-암즈", R.drawable.hands_autoarms,/*여기까지 팔*/ "슬리퍼", R.drawable.leg_slippers, "운동화", R.drawable.leg_running_shoes, "타이즈", R.drawable.leg_tights)
                ,Item_list("무릎 보호대", R.drawable.leg_knee_pads, "체인 레깅스", R.drawable.leg_chain_leggings, "하이힐", R.drawable.leg_high_heels, "힐리스", R.drawable.leg_heelys)
                ,Item_list("덧댄 슬리퍼", R.drawable.leg_repaired_slippers, "부츠", R.drawable.leg_boots, "강철 무릎 보호대", R.drawable.leg_steel_knee_pads, "풍화륜", R.drawable.leg_straitjacket_sneakers)
                ,Item_list("매버릭 러너", R.drawable.leg_maverick_runner, "전투화", R.drawable.leg_combat_boots, "킬힐", R.drawable.leg_killer_heels, "경량화 부츠", R.drawable.leg_feather_boots)
                ,Item_list("미스릴 부츠", R.drawable.leg_mithril_boots, "부케팔로스", R.drawable.leg_bucephalus, "클링온 부츠", R.drawable.leg_white_rhinos, "EOD 부츠", R.drawable.leg_eod_boots)
                ,Item_list("분홍신", R.drawable.leg_red_shoes, "글레이셜 슈즈", R.drawable.leg_glacial_shoes, "헤르메스 부츠", R.drawable.leg_boots_of_hermes, /*여기까지 다리*/ "깃털", R.drawable.deco_feather)
                ,Item_list("꽃", R.drawable.deco_flower, "리본", R.drawable.deco_ribbon, "부채", R.drawable.deco_fan, "불경", R.drawable.deco_buddhist_scripture)
                ,Item_list("상자", R.drawable.deco_box, "성배", R.drawable.deco_holy_grail, "십자가", R.drawable.deco_cross, "쌍안경", R.drawable.deco_binoculars)
                ,Item_list("군선", R.drawable.deco_gilded_quill_fan, "성자의 유산", R.drawable.deco_saint_relic, "운명의 꽃", R.drawable.deco_flower_of_fate, "유리 조각", R.drawable.deco_glass_pieces)
                ,Item_list("인형", R.drawable.deco_doll, "저격 스코프", R.drawable.deco_sniping_scope, "진신사리", R.drawable.deco_buddha_sarira, "화살통", R.drawable.deco_quiver)
                ,Item_list("먼지털이개", R.drawable.deco_feather_duster, "생명의 가루", R.drawable.deco_powder_of_life, "우치화", R.drawable.deco_uchiwa, "탄창", R.drawable.deco_magazine)
                ,Item_list("달빛 펜던트", R.drawable.deco_moonlight_pendant, "슈뢰딩거의 상자", R.drawable.deco_schrodinger_box, "진리는 나의 빛", R.drawable.deco_veritas_lux_mea, "백우선", R.drawable.deco_white_crane_fan)
                ,Item_list("궁기병의 화살통", R.drawable.deco_laced_quiver, "만년빙", R.drawable.deco_glacial_ice, "삼매진화", R.drawable.deco_true_samadhi_fire, "에메랄드 타블렛", R.drawable.deco_emerald_tablet)/*여기까지 장식, 방어구 끝*/
                ,Item_list(/*무기시작*/"가위", R.drawable.dagger_scissors, "만년필", R.drawable.dagger_fountain_pen, "식칼", R.drawable.dagger_kitchen_knife, "군용 나이프", R.drawable.dagger_army_knife)
                ,Item_list("장미칼", R.drawable.dagger_rose_knife, "카른웬난", R.drawable.dagger_carnwennan, "파산검", R.drawable.dagger_mount_slicer, "초진동나이프", R.drawable.dagger_vibroblade)
                ,Item_list("프라가라흐", R.drawable.dagger_fragarach/*단검 끝*/, "녹슨 검", R.drawable.parry_rusty_sword, "샴쉬르", R.drawable.parry_shamshir, "일본도", R.drawable.parry_katana)
                ,Item_list("마사무네", R.drawable.parry_masamune, "무라마사", R.drawable.parry_muramasa, "바스타드 소드", R.drawable.parry_bastard_sword, "보검", R.drawable.parry_jewel_sword)
                ,Item_list("뚜언 띠엔", R.drawable.parry_thuan_thien, "플라즈마 소드", R.drawable.parry_plasma_sword, "아론다이트", R.drawable.parry_arondight, "엑스칼리버", R.drawable.parry_excalibur)
                ,Item_list("모노호시자오", R.drawable.parry_monohoshizao, "호푸어드", R.drawable.parry_hovud, "레바테인", R.drawable.parry_laevateinn, "다인슬라이프", R.drawable.parry_dainsleif)/*양손검 끝*/
                ,Item_list("곡괭이", R.drawable.exe_pickaxe, "손도끼", R.drawable.exe_hatchet, "사슬 낫", R.drawable.exe_chain_scythe, "전투 도끼", R.drawable.exe_battle_axe)
                ,Item_list("경량화 도끼", R.drawable.exe_light_hatchet, "사신의 낫", R.drawable.exe_reaper_scythe, "대부", R.drawable.exe_gigantic_axe, "빔 엑스", R.drawable.exe_beam_axe)
                ,Item_list("산타 무에르테", R.drawable.exe_santa_muerte, "스퀴테", R.drawable.exe_scythe, "파라슈", R.drawable.exe_parashu, "하르페", R.drawable.exe_harpe)/*도끼 끝*/
                ,Item_list("쌍칼", R.drawable.dual_twin_sword, "피렌체식 쌍검", R.drawable.dual_florentine, "이천일류", R.drawable.dual_divine_dual_swords, "자웅일대검", R.drawable.dual_starsteel_twin_swords)
                ,Item_list("디오스쿠로이", R.drawable.dual_dioscuri, "로이거 차르", R.drawable.dual_lloigor_zahr/*쌍검 끝*/, "발터 PPK\u002dMagnum", R.drawable.revolber_walter_ppk, "매그넘\u002d파이썬", R.drawable.revolber_magnum_python)
                ,Item_list("베레타 M92F", R.drawable.revolber_beretta_m92f, "FN57", R.drawable.revolber_fn57, "더블 리볼버 SP", R.drawable.revolber_double_revolver_sp, "매그넘\u002d아나콘다", R.drawable.revolber_magnum_anaconda)
                ,Item_list("마탄의 사수", R.drawable.revolber_devil_marksman, "엘레강스", R.drawable.revolber_elegance, "일렉트론 블라스터", R.drawable.revolber_electron_blaster, "매그넘\u002d보아", R.drawable.revolber_magnum_boa)
                ,Item_list("악켈테", R.drawable.revolber_kelte_new/*권총 끝*/, "페도로프 자동소총", R.drawable.overhit_fedorova_new, "STG\u002d44", R.drawable.overhit_stg44, "AK\u002d47", R.drawable.overhit_ak47)
                ,Item_list("M16A1", R.drawable.overhit_m16a1, "기관총", R.drawable.overhit_machine_gun, "개틀링건", R.drawable.overhit_gatling_gun, "AK\u002d12", R.drawable.overhit_ak12_new)
                ,Item_list("XCR", R.drawable.overhit_xcr/*돌격소총 끝*/, "바늘", R.drawable.quickcut_needle, "레이피어", R.drawable.quickcut_rapier, "매화검", R.drawable.quickcut_apricot_sword)
                ,Item_list("활빈검", R.drawable.quickcut_sword_of_justice, "듀랜달 Mk2", R.drawable.quickcut_durenda_mk2, "볼틱레토", R.drawable.quickcut_volticletto, "유성검", R.drawable.quickcut_meteor_claymore)
                ,Item_list("주와이외즈", R.drawable.quickcut_joyeuse, "미스틸테인", R.drawable.quickcut_mistilteinn/*레이피어 끝*/, "단창", R.drawable.shadowstep_short_spear, "죽창", R.drawable.shadowstep_bamboo_spear)
                ,Item_list("바이던트", R.drawable.shadowstep_bident, "파이크", R.drawable.shadowstep_pike, "도끼창", R.drawable.shadowstep_halberd_axe, "강창", R.drawable.shadowstep_sharpened_spear)
                ,Item_list("애각창", R.drawable.shadowstep_gentian_silver_gun, "장팔사모", R.drawable.shadowstep_eighteen_foot_spear, "코스믹 바이던트", R.drawable.shadowstep_cosmic_bident, "트리아이나", R.drawable.shadowstep_lance_of_poseidon)
                ,Item_list("방천화극", R.drawable.shadowstep_fangtian_huaji, "청룡언월도", R.drawable.shadowstep_dragon_guandao, "화첨창", R.drawable.shadowstep_blazing_lance, "롱기누스의 창", R.drawable.shadowstep_spear_of_longinus)/*창 끝*/
                ,Item_list("망치", R.drawable.hammer_hammer, "워해머", R.drawable.hammer_warhammer, "모닝 스타", R.drawable.hammer_morning_star, "사슴 망치", R.drawable.hammer_black_stag_hammer)
                ,Item_list("낭아봉", R.drawable.hammer_fang_mace, "다그다의 망치", R.drawable.hammer_hammer_of_dagda, "토르의 망치", R.drawable.hammer_hammer_of_thor, "개밥바라기", R.drawable.hammer_evening_star_new)
                ,Item_list("마법봉", R.drawable.hammer_magic_stick/*망치 끝*/, "야구공", R.drawable.throw_signed_ball, "쇠구슬", R.drawable.throw_iron_ball, "수류탄", R.drawable.throw_grenade)
                ,Item_list("화염병", R.drawable.throw_molotov_cocktail, "싸인볼", R.drawable.throw_signed_ball, "슬링", R.drawable.throw_sling, "밀가루 폭탄", R.drawable.throw_flour_bomb)
                ,Item_list("볼 라이트닝", R.drawable.throw_ball_lightning, "플러버", R.drawable.throw_flubber, "가시 탱탱볼", R.drawable.throw_spiky_bouncy_ball, "소이탄", R.drawable.throw_incendiary_bomb)
                ,Item_list("안티오크의 수류탄", R.drawable.throw_grenade_of_antioch, "다비드슬링", R.drawable.throw_david_sling, "연막탄", R.drawable.throw_smoke_bomb, "고폭 수류탄", R.drawable.throw_high_explosive_grenade)
                ,Item_list("루테늄 구슬", R.drawable.throw_ruthenium_marble/*투척 끝*/, "나뭇가지", R.drawable.swing_branch, "단봉", R.drawable.swing_short_rod, "장봉", R.drawable.swing_long_rod)
                ,Item_list("도깨비 방망이", R.drawable.swing_goblin_bat, "우산", R.drawable.swing_umbrella, "횃불", R.drawable.swing_torch, "구원의 여신상", R.drawable.swing_statue_of_soteria)
                ,Item_list("타구봉", R.drawable.swing_mallet, "스파이의 우산", R.drawable.swing_spy_umbrella, "여의봉", R.drawable.swing_monkey_king_bar/*방망이 끝*/, "면도칼", R.drawable.ninja_razor)
                ,Item_list("트럼프 카드", R.drawable.playing_cards, "분필", R.drawable.ninja_chalk, "다트", R.drawable.ninja_dart, "빈티지 카드", R.drawable.ninja_vintage_card)
                ,Item_list("표창", R.drawable.ninja_throwing_stars, "흑건", R.drawable.ninja_onyx_dagger, "부적", R.drawable.ninja_charm, "유엽비도", R.drawable.ninja_willow_leaf_spike)
                ,Item_list("챠크람", R.drawable.ninja_chakram, "매화비표", R.drawable.ninja_apricot_flower_tag, "독침", R.drawable.ninja_venom_dart, "법륜", R.drawable.ninja_dharma_chakram)
                ,Item_list("플럼바타", R.drawable.ninja_plumbata, "미치광이왕의 카드", R.drawable.ninja_cards_of_tyranny, "옥전결", R.drawable.ninja_mystic_jade_charm, "풍마 수리검", R.drawable.ninja_fuhma_shuriken)
                ,Item_list("빙백은침", R.drawable.ninja_frost_venom_dart, "푸른색 단도", R.drawable.dagger_azure_dagger, "플레셋", R.drawable.ninja_flechette, "건곤권", R.drawable.ninja_wind_and_fire_wheels)
                ,Item_list("생사부", R.drawable.ninja_death_rune, "수다르사나", R.drawable.ninja_sudarsana, "만천화우", R.drawable.ninja_petal_torrent/*암기 끝*/, "양궁", R.drawable.bow_bow)
                ,Item_list("목궁", R.drawable.bow_wooden_bow, "장궁", R.drawable.bow_longbow, "컴포지트 보우", R.drawable.bow_composite_bow, "강궁", R.drawable.bow_strong_bow)
                ,Item_list("국궁", R.drawable.bow_stallion_bow, "벽력궁", R.drawable.bow_mighty_bow, "탄궁", R.drawable.bow_pellet_bow, "화전", R.drawable.bow_scorchbow)
                ,Item_list("편전", R.drawable.bow_ancient_bolt, "골든래쇼 보우", R.drawable.hands_golden_bracelet, "트윈보우", R.drawable.bow_twinbow, "엘리멘탈 보우", R.drawable.bow_elemental_bow)
                ,Item_list( "페일노트", R.drawable.bow_failnaught/*활 끝*/, "석궁", R.drawable.crossbow_short_crossbow, "쇠뇌", R.drawable.crossbow_long_crossbow, "크로스보우", R.drawable.crossbow_crossbow)
                ,Item_list("노", R.drawable.crossbow_power_crossbow, "저격궁", R.drawable.crossbow_sniper_bow, "헤비 크로스보우", R.drawable.crossbow_heavy_crossbow, "철궁", R.drawable.crossbow_steel_bow)
                ,Item_list("대황", R.drawable.crossbow_the_legend_of_the_general, "발리스타", R.drawable.crossbow_ballista, "저격 크로스보우", R.drawable.crossbow_sniper_crossbow, "영광금귀신기노", R.drawable.crossbow_the_golden_ghost)
                ,Item_list("샤릉가", R.drawable.crossbow_sharanga/*석궁 끝*/, "너클", R.drawable.glove_knuckle, "목장갑", R.drawable.glove_cotton_work_glove, "글러브", R.drawable.glove_leather_glove)
                ,Item_list("아이언 너클", R.drawable.glove_iron_knuckle, "건틀릿", R.drawable.glove_gauntlet, "윙 너클", R.drawable.glove_wing_knuckle, "귀골 장갑", R.drawable.glove_bone_gauntlet)
                ,Item_list("벽력귀투", R.drawable.glove_shatter_shell_gauntlet, "유리 너클", R.drawable.glove_glass_knuckle, "회단 장갑", R.drawable.glove_phoenix_gloves, "단영촌천투", R.drawable.glove_one_inch_punch)
                ,Item_list("디바인 피스트", R.drawable.glove_divine_fist, "블러드윙 너클", R.drawable.glove_bloodwing_knuckle, "빙화현옥수", R.drawable.glove_frost_petal_hand, "여래수투", R.drawable.glove_buddha_palm)
                ,Item_list("브레이질 건틀릿", R.drawable.glove_brasil_gauntlet, "소수", R.drawable.glove_white_claw_punch, "천잠장갑", R.drawable.glove_imperial_silk_glove/*글러브 끝*/, "대나무", R.drawable.tonpa_bamboo)
                ,Item_list("톤파", R.drawable.tonpa_tonfa, "경찰봉", R.drawable.tonpa_police_baton, "류큐톤파", R.drawable.tonpa_ryukyu_tonfa, "택티컬 톤파", R.drawable.tonpa_tactical_tonfa)
                ,Item_list("마이쏙", R.drawable.tonpa_mai_sok, "플라즈마 톤파", R.drawable.tonpa_plasma_tonfa/*톤파 끝*/, "보급형 기타", R.drawable.guitar_starter_guitar, "골든 브릿지", R.drawable.guitar_golden_bridge)
                ,Item_list("싱글 픽업", R.drawable.guitar_single_coil_pickup, "루비 스페셜", R.drawable.guitar_ruby_special, "험버커 픽업", R.drawable.guitar_humbucker_pickup, "King-V", R.drawable.guitar_king_v)
                ,Item_list("노캐스터", R.drawable.guitar_nocaster, "슈퍼스트랫", R.drawable.guitar_superstrat, "야생마", R.drawable.guitar_wild_horse, "보헤미안", R.drawable.guitar_bohemian)
                ,Item_list("천국의 계단", R.drawable.guitar_stairway_to_heaven, "퍼플 헤이즈", R.drawable.guitar_purple_haze, "새티스팩션", R.drawable.guitar_satisfaction, "원더풀 투나잇", R.drawable.guitar_wonderful_tonight)
                ,Item_list("더 월", R.drawable.guitar_the_wall, "틴 스피릿", R.drawable.guitar_teen_spirit/*기타 끝*/, "쇠사슬", R.drawable.chinaweapon_steel_chain, "눈차크", R.drawable.chinaweapon_nunchaku)
                ,Item_list("샤퍼", R.drawable.chinaweapon_sharper, "블리더", R.drawable.chinaweapon_bleeder, "대소반룡곤", R.drawable.chinaweapon_the_smiting_dragon, "초진동눈차크", R.drawable.chinaweapon_vibro_nunchaku/*쌍절곤, 무기 끝*/)
                ,Item_list(/*소비 및 음식 시작*/"감자", R.drawable.food_potato, "대구", R.drawable.food_cod, "레몬", R.drawable.food_lemon, "마늘", R.drawable.food_garlic)
                ,Item_list("반창고", R.drawable.food_band_aid, "붕어", R.drawable.food_carp, "빵", R.drawable.food_bread, "고기", R.drawable.food_meat)
                ,Item_list("달걀", R.drawable.food_egg, "생라면", R.drawable.food_ramen, "약초", R.drawable.food_oriental_herb, "초콜렛", R.drawable.food_chocolate)
                ,Item_list("카레 가루", R.drawable.food_curry_powder, "꿀 바른 대구살", R.drawable.food_honey_cod_steak, "대구 간 통조림", R.drawable.food_canned_cod_liver, "마늘빵", R.drawable.food_garlic_bread)
                ,Item_list("버터", R.drawable.food_butter, "보약", R.drawable.food_herb_medicine, "붕어빵", R.drawable.food_bungeoppang, "성수", R.drawable.food_holy_water)
                ,Item_list("지혈제", R.drawable.food_styptic, "초코파이", R.drawable.food_choco_pie_box, "한방침", R.drawable.food_acupuncture, "난초", R.drawable.food_orchid)
                ,Item_list("탄두리", R.drawable.food_tandoori_chicken, "마늘 베이컨 말이", R.drawable.food_bacon_and_garlic_sticks, "번", R.drawable.food_bun, "햄버거", R.drawable.food_hamburger)
                ,Item_list("감자빵", R.drawable.food_potato_bread, "감자스프", R.drawable.food_potato_soup, "달걀 생선 필레", R.drawable.food_fish_fillet_with_egg, "시트러스 케이크", R.drawable.food_citrus_cake)
                ,Item_list("레몬 아이스크림", R.drawable.food_lemon_ice_cream, "마늘 꿀절임", R.drawable.food_honey_garlic_pickle, "계란빵", R.drawable.food_egg_bun, "이스터 에그", R.drawable.food_easter_egg)
                ,Item_list("위스키 봉봉", R.drawable.food_whiskey_bonbon, "초코 아이스크림", R.drawable.food_choco_ice_cream, "카레빵", R.drawable.food_curry_bun, "감자튀김", R.drawable.food_french_fries)
                ,Item_list("구운 감자", R.drawable.food_baked_potato, "구운 붕어", R.drawable.food_baked_carp, "메로구이", R.drawable.food_grilled_chilean_sea_bass, "뜨거운 라면", R.drawable.food_hot_ramen)
                ,Item_list("모카빵", R.drawable.food_mocha_bread, "스크램블 에그", R.drawable.food_scrambled_eggs, "초코칩 쿠키", R.drawable.food_chocolate_chip_cookies, "초코파이 상자", R.drawable.food_choco_pie_box)
                ,Item_list("카레", R.drawable.food_curry, "탕약", R.drawable.food_oriental_concoction, "허니버터", R.drawable.food_honey_butter, "후라이드 치킨", R.drawable.food_fried_chicken)
                ,Item_list("힐링 포션", R.drawable.food_healing_potion, "삶은 달걀", R.drawable.food_hard_boiled_egg, "파운드 케이크", R.drawable.food_pound_cake, "카레 고로케", R.drawable.food_curry_croquette)
                ,Item_list("스테이크", R.drawable.food_steak, "구급상자", R.drawable.food_first_aid_kit, "버터 감자구이", R.drawable.food_butter_fried_potatoes, "생선까스", R.drawable.food_fish_cutlet)
                ,Item_list("볶음라면", R.drawable.food_stir_fried_ramen, "냉면", R.drawable.food_cold_noodles, "마늘라면", R.drawable.food_garlic_ramen, "매운탕", R.drawable.food_spicy_fish_stew)
                ,Item_list("대환단", R.drawable.food_zen_vitality, "피쉬 앤 칩스", R.drawable.food_fish_and_chips/*음식 끝*/, /*음료 시작*/"꿀", R.drawable.drink_honey, "물", R.drawable.drink_water)
                ,Item_list("얼음", R.drawable.drink_ice, "위스키", R.drawable.drink_whiskey, "커피콩", R.drawable.drink_coffee, "탄산수", R.drawable.drink_carbonated_water)
                ,Item_list("우유", R.drawable.drink_milk, "뜨거운 물", R.drawable.drink_boiling_water, "레몬에이드", R.drawable.drink_lemonade, "물병", R.drawable.drink_water_bottle)
                ,Item_list("백주", R.drawable.drink_sorghum_wine, "소주", R.drawable.drink_soju, "아이스 커피", R.drawable.drink_ice_coffee, "칵테일", R.drawable.drink_cocktail)
                ,Item_list("커피 리큐르", R.drawable.drink_coffee_liqueur, "콜라", R.drawable.drink_coke, "카페라테", R.drawable.drink_latte, "꿀탄 우유", R.drawable.drink_honey_milk)
                ,Item_list("하이볼", R.drawable.drink_highball, "초코 우유", R.drawable.drink_chocolate_milk, "꿀물", R.drawable.drink_honey_water, "얼음물", R.drawable.drink_ice_water)
                ,Item_list("온더락", R.drawable.drink_on_the_rocks, "카우보이", R.drawable.drink_cowboy, "고량주", R.drawable.drink_kaoliang_liquor, "뜨거운 꿀물", R.drawable.drink_hot_honey_water)
                ,Item_list("백일취", R.drawable.drink_flower_liquor, "아메리카노", R.drawable.drink_americano, "약주", R.drawable.drink_herbal_liquor, "위스키 콕", R.drawable.drink_whiskey_cocktail)
                ,Item_list("정화수", R.drawable.drink_purified_water, "캔 콜라", R.drawable.drink_canned_coke, "핫초코", R.drawable.drink_hot_chocolate, "깔루아 밀크", R.drawable.drink_kahlua_milk/*음료 , 소비 끝*/)
                ,Item_list(/*특수 시작*/"감시 카메라", R.drawable.trap_surveillance_camera, "올가미", R.drawable.trap_snare, "쥐덫", R.drawable.trap_mouse_trap, "피아노선", R.drawable.trap_piano_wire)
                ,Item_list("가시 발판", R.drawable.trap_spiked_plank, "개량형 쥐덫", R.drawable.trap_enhanced_mouse_trap, "다이너마이트", R.drawable.trap_dynamite, "대나무 트랩", R.drawable.trap_bamboo_trap)
                ,Item_list("부비트랩", R.drawable.trap_booby_trap, "소란 발생기", R.drawable.trap_clang_clatter, "망원 카메라", R.drawable.trap_telephoto_camera, "정글 기요틴", R.drawable.trap_jungle_guillotine)
                ,Item_list("폭발 트랩", R.drawable.trap_explosive_trap, "펜듈럼 도끼", R.drawable.trap_pendulum_axe, "지뢰", R.drawable.trap_mine, "RDX", R.drawable.trap_rdx)
                ,Item_list("미스릴 실", R.drawable.trap_mithril_string, "히든 메이든", R.drawable.trap_hidden_maiden, "화염 트랩", R.drawable.trap_fire_trap, "C-4", R.drawable.trap_c_4)
                ,Item_list("더블 기요틴", R.drawable.trap_double_guillotine, "크레모어", R.drawable.trap_claymore, "폭뢰침", R.drawable.trap_stingburst, "리모트 마인", R.drawable.trap_remote_mine)
                ,Item_list("스마트 폭탄", R.drawable.trap_smart_bomb, "", R.drawable.notedory, "", R.drawable.notedory, "", R.drawable.notedory/*471이 마지막. 특수 끝*/)
        )


        ItemList.remove(Item_list("머리띠", R.drawable.head_hairband, "모자", R.drawable.head_hat, "자전거 헬멧", R.drawable.head_bike_helmet, "가면", R.drawable.head_mask))

        binding.check2
        binding.check3
        binding.check4
        binding.check5
        binding.rvItem.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvItem.setHasFixedSize(true)
        binding.rvItem.adapter = Item_Adapter(ItemList)

}

    class delete(val ItemList : ArrayList<Item_list>, val position : Int) {
        ItemList = Item_Adapter(ItemList)
    }
}

# kzt-max-health
プレイヤーのマックス体力を簡単に変更することができるプラグイン<br>
1.9-1.21対応（1.20で動作安定）

# 使用方法
## ①configで設定する
プラグイン作成によってconfig.ymlが作られます<br>
その中の<br>
default-health: 40.0<br>
という項目でHPを設定できます<br>
[ HP = ハートの数×2 (40HP = ハート20個 = 2列分の体力）]

## ②コマンドで設定する
/sethealth <プレイヤー> <HP（ハート数×2）> <br>
maxhealth.set権限が必要です

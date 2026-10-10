package ir.andy.core.helper

object Pages {
    const val HOME = """
        <!doctype html>
<html lang="en" dir="ltr" data-theme="nord">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Downloader</title>

<script>
(function(){
  try {
    var t = localStorage.getItem('dl.theme');
    var l = localStorage.getItem('dl.lang');
    if (t) document.documentElement.dataset.theme = t;
    if (l) {
      document.documentElement.lang = l;
      document.documentElement.dir = l === 'fa' ? 'rtl' : 'ltr';
    }
  } catch(e){}
})();
</script>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Fraunces:opsz,wght@9..144,500;9..144,600;9..144,700&family=Inter:wght@400;500;600;700&family=JetBrains+Mono:wght@400;500;700&family=Vazirmatn:wght@400;500;600;700&display=swap" rel="stylesheet">

<style>
/* ============================================================
   THEMES
   ============================================================ */

/* --- Nord (default) --- */
html[data-theme="nord"]{
  --bg:#2e3440; --surface:#3b4252; --surface-2:#434c5e;
  --ink:#eceff4; --ink-soft:#d8dee9; --muted:#8f9bb0;
  --rule:#4c566a; --rule-strong:#5b6579;
  --accent:#88c0d0; --accent-fg:#2e3440;
  --ok:#a3be8c; --warn:#ebcb8b; --err:#bf616a;
  --radius:10px; --border-w:1px; --shadow:none;
  --font-head:'Inter',system-ui,sans-serif;
  --font-body:'Inter',system-ui,sans-serif;
  --font-mono:'JetBrains Mono',monospace;
  --head-weight:600; --head-tracking:-.02em;
  --card-style:box; --btn-radius:10px;
  color-scheme:dark;
}

/* --- Paper (editorial light) --- */
html[data-theme="paper"]{
  --bg:#f4f1e9; --surface:#fbfaf6; --surface-2:#efece3;
  --ink:#1c1a17; --ink-soft:#3a3630; --muted:#847c6e;
  --rule:#dcd5c6; --rule-strong:#c9c0ac;
  --accent:#a83a2c; --accent-fg:#fbfaf6;
  --ok:#2f7a4d; --warn:#a86a1e; --err:#a83a2c;
  --radius:2px; --border-w:1px; --shadow:none;
  --font-head:'Fraunces',Georgia,serif;
  --font-body:'Inter',system-ui,sans-serif;
  --font-mono:'JetBrains Mono',monospace;
  --head-weight:600; --head-tracking:-.015em;
  --card-style:rule; --btn-radius:2px;
  color-scheme:light;
}

/* --- Ink (dark editorial) --- */
html[data-theme="ink"]{
  --bg:#141310; --surface:#1b1a16; --surface-2:#232219;
  --ink:#eae5d9; --ink-soft:#cfc9ba; --muted:#8c8677;
  --rule:#2d2b26; --rule-strong:#3d3a33;
  --accent:#e0b558; --accent-fg:#141310;
  --ok:#7fc99b; --warn:#e0b558; --err:#e07a6f;
  --radius:2px; --border-w:1px; --shadow:none;
  --font-head:'Fraunces',Georgia,serif;
  --font-body:'Inter',system-ui,sans-serif;
  --font-mono:'JetBrains Mono',monospace;
  --head-weight:600; --head-tracking:-.015em;
  --card-style:rule; --btn-radius:2px;
  color-scheme:dark;
}

/* --- Terminal (phosphor) --- */
html[data-theme="terminal"]{
  --bg:#06080a; --surface:#0a0e12; --surface-2:#0d1216;
  --ink:#8effb0; --ink-soft:#6ad996; --muted:#3d6b52;
  --rule:#12291c; --rule-strong:#1c3c29;
  --accent:#8effb0; --accent-fg:#06080a;
  --ok:#8effb0; --warn:#ffd479; --err:#ff6b6b;
  --radius:0px; --border-w:1px; --shadow:none;
  --font-head:'JetBrains Mono',monospace;
  --font-body:'JetBrains Mono',monospace;
  --font-mono:'JetBrains Mono',monospace;
  --head-weight:700; --head-tracking:0;
  --card-style:box; --btn-radius:0px;
  color-scheme:dark;
}

/* --- Brutalist --- */
html[data-theme="brutalist"]{
  --bg:#eeece7; --surface:#ffffff; --surface-2:#f5f3ee;
  --ink:#000000; --ink-soft:#1a1a1a; --muted:#5a5a5a;
  --rule:#000000; --rule-strong:#000000;
  --accent:#ffdd00; --accent-fg:#000000;
  --ok:#00a84f; --warn:#e8a500; --err:#e02020;
  --radius:0px; --border-w:2px; --shadow:5px 5px 0 0 #000;
  --font-head:'Inter',system-ui,sans-serif;
  --font-body:'Inter',system-ui,sans-serif;
  --font-mono:'JetBrains Mono',monospace;
  --head-weight:800; --head-tracking:-.035em;
  --card-style:box; --btn-radius:0px;
  color-scheme:light;
}

/* --- Dracula --- */
html[data-theme="dracula"]{
  --bg:#282a36; --surface:#2d303e; --surface-2:#343746;
  --ink:#f8f8f2; --ink-soft:#c8c8c2; --muted:#6272a4;
  --rule:#44475a; --rule-strong:#52566b;
  --accent:#bd93f9; --accent-fg:#282a36;
  --ok:#50fa7b; --warn:#f1fa8c; --err:#ff5555;
  --radius:10px; --border-w:1px; --shadow:none;
  --font-head:'Inter',system-ui,sans-serif;
  --font-body:'Inter',system-ui,sans-serif;
  --font-mono:'JetBrains Mono',monospace;
  --head-weight:600; --head-tracking:-.02em;
  --card-style:box; --btn-radius:10px;
  color-scheme:dark;
}

/* --- Catppuccin Mocha --- */
html[data-theme="catppuccin"]{
  --bg:#1e1e2e; --surface:#252537; --surface-2:#313244;
  --ink:#cdd6f4; --ink-soft:#bac2de; --muted:#6c7086;
  --rule:#313244; --rule-strong:#45475a;
  --accent:#cba6f7; --accent-fg:#1e1e2e;
  --ok:#a6e3a1; --warn:#f9e2af; --err:#f38ba8;
  --radius:12px; --border-w:1px; --shadow:none;
  --font-head:'Inter',system-ui,sans-serif;
  --font-body:'Inter',system-ui,sans-serif;
  --font-mono:'JetBrains Mono',monospace;
  --head-weight:600; --head-tracking:-.02em;
  --card-style:box; --btn-radius:12px;
  color-scheme:dark;
}

/* --- Solarized Light --- */
html[data-theme="solarized"]{
  --bg:#fdf6e3; --surface:#fef9ef; --surface-2:#eee8d5;
  --ink:#073642; --ink-soft:#586e75; --muted:#93a1a1;
  --rule:#ddd6c1; --rule-strong:#c9c2ad;
  --accent:#268bd2; --accent-fg:#fdf6e3;
  --ok:#859900; --warn:#b58900; --err:#dc322f;
  --radius:8px; --border-w:1px; --shadow:none;
  --font-head:'Inter',system-ui,sans-serif;
  --font-body:'Inter',system-ui,sans-serif;
  --font-mono:'JetBrains Mono',monospace;
  --head-weight:600; --head-tracking:-.02em;
  --card-style:box; --btn-radius:8px;
  color-scheme:light;
}

/* ============================================================
   BASE
   ============================================================ */
*{ box-sizing:border-box; }
html,body{ min-height:100%; }
body{
  margin:0; background:var(--bg); color:var(--ink);
  font:15px/1.55 var(--font-body);
  -webkit-font-smoothing:antialiased;
  transition:background-color .3s ease, color .3s ease;
}
html[lang="fa"] body{ font-family:'Vazirmatn',var(--font-body); line-height:1.75; }

/* Per-theme background texture */
body::before{ content:""; position:fixed; inset:0; pointer-events:none; z-index:0; }
html[data-theme="terminal"] body::before{
  background:repeating-linear-gradient(0deg,transparent 0 2px,rgba(142,255,176,.025) 2px 3px);
}
html[data-theme="brutalist"] body::before{
  background-image:radial-gradient(#000 1px,transparent 1px);
  background-size:18px 18px; opacity:.07;
}
html[data-theme="paper"] body::before{
  background:linear-gradient(180deg,rgba(0,0,0,.012),transparent 200px),
             radial-gradient(1200px 400px at 50% 0%,rgba(168,58,44,.035),transparent 70%);
}
html[data-theme="ink"] body::before{
  background:radial-gradient(1000px 400px at 50% 0%,rgba(224,181,88,.05),transparent 70%);
}
html[data-theme="nord"] body::before{
  background:radial-gradient(1100px 500px at 50% -10%,rgba(136,192,208,.06),transparent 70%);
}
html[data-theme="dracula"] body::before{
  background:radial-gradient(1100px 500px at 50% -10%,rgba(189,147,249,.06),transparent 70%);
}
html[data-theme="catppuccin"] body::before{
  background:radial-gradient(1100px 500px at 50% -10%,rgba(203,166,247,.06),transparent 70%);
}
html[data-theme="solarized"] body::before{
  background:radial-gradient(1100px 500px at 50% -10%,rgba(38,139,210,.05),transparent 70%);
}

/* ============================================================
   LAYOUT
   ============================================================ */
.wrap{
  position:relative; z-index:1; max-width:820px; margin:0 auto;
  padding:56px 24px 120px;
  animation:pageIn .5s cubic-bezier(.2,.8,.3,1) both;
}
@keyframes pageIn{ from{ opacity:0; transform:translateY(8px);} }

/* ============================================================
   HEADER
   ============================================================ */
header{
  display:flex; align-items:flex-start; justify-content:space-between;
  gap:20px; margin-bottom:36px; flex-wrap:wrap;
  padding-bottom:20px;
  border-bottom:var(--border-w) solid var(--rule);
  animation:headerIn .6s cubic-bezier(.2,.8,.3,1) both .05s;
}
@keyframes headerIn{ from{ opacity:0; transform:translateY(-8px);} }

.brand{ display:flex; align-items:center; gap:14px; }

.logo{
  width:40px; height:40px; flex:0 0 auto;
  border-radius:var(--radius);
  background:var(--accent); color:var(--accent-fg);
  display:grid; place-items:center;
  transition:background .3s, color .3s, transform .3s;
  animation:logoPop .6s cubic-bezier(.2,.9,.3,1.5) both;
}
@keyframes logoPop{
  from{ transform:scale(.5) rotate(-20deg); opacity:0; }
}
html[data-theme="brutalist"] .logo{
  border:var(--border-w) solid var(--rule);
  box-shadow:3px 3px 0 0 var(--rule);
}
html[data-theme="terminal"] .logo{
  background:transparent; color:var(--accent);
  border:1px solid var(--accent);
}
.logo svg{ width:20px; height:20px; display:block; }

h1{
  font-family:var(--font-head); font-size:24px;
  font-weight:var(--head-weight); letter-spacing:var(--head-tracking);
  line-height:1.15; margin:0;
}
html[lang="fa"] h1{ font-size:22px; }
.tag{ font-size:12px; color:var(--muted); margin-top:3px; letter-spacing:.02em; }

.controls{ display:flex; align-items:center; gap:8px; flex-wrap:wrap; }

/* ============================================================
   TOOL BUTTONS
   ============================================================ */
.tool{
  height:38px; padding:0 12px;
  background:transparent;
  border:var(--border-w) solid var(--rule);
  border-radius:var(--btn-radius);
  color:var(--ink); cursor:pointer;
  font:inherit; font-size:13px; font-weight:500;
  display:inline-flex; align-items:center; gap:8px;
  transition:background .18s, border-color .18s, color .18s, transform .15s, box-shadow .18s;
  -webkit-tap-highlight-color:transparent;
  position:relative; overflow:hidden;
}
.tool::after{
  content:""; position:absolute; inset:0;
  background:currentColor; opacity:0;
  transition:opacity .18s;
  pointer-events:none;
}
.tool:hover::after{ opacity:.06; }
.tool:hover{ border-color:var(--ink); }
.tool:active{ transform:translateY(1px); }
.tool svg{ width:16px; height:16px; display:block; }
.tool.square{ width:38px; padding:0; justify-content:center; }

html[data-theme="brutalist"] .tool{ box-shadow:3px 3px 0 0 var(--rule); }
html[data-theme="brutalist"] .tool:hover{
  transform:translate(-1px,-1px); box-shadow:4px 4px 0 0 var(--rule);
}
html[data-theme="brutalist"] .tool:active{
  transform:translate(2px,2px); box-shadow:1px 1px 0 0 var(--rule);
}

/* ============================================================
   STATUS PILL
   ============================================================ */
.status{
  display:inline-flex; align-items:center; gap:8px;
  font-size:12px; color:var(--muted); padding:8px 0;
  letter-spacing:.02em;
}
html[data-theme="terminal"] .status::before{ content:"["; color:var(--muted); }
html[data-theme="terminal"] .status::after{ content:"]"; color:var(--muted); }
html[data-theme="terminal"] .status{ padding:8px 4px; }

.dot{
  width:7px; height:7px; border-radius:50%;
  background:var(--muted); transition:background .25s;
}
html[data-theme="terminal"] .dot{ border-radius:0; }
.dot.on{ background:var(--ok); animation:dotPulse 2.6s ease-in-out infinite; }
.dot.off{ background:var(--err); }
@keyframes dotPulse{ 50%{ opacity:.35; } }

/* ============================================================
   THEME MENU
   ============================================================ */
.theme-wrap{ position:relative; }
.theme-menu{
  position:absolute; top:calc(100% + 8px); inset-inline-end:0;
  background:var(--surface);
  border:var(--border-w) solid var(--rule);
  border-radius:var(--radius);
  box-shadow:var(--shadow);
  padding:6px; min-width:230px; z-index:50;
  animation:menuIn .2s cubic-bezier(.2,.8,.3,1);
  max-height:min(70vh,420px); overflow-y:auto;
}
html[data-theme="brutalist"] .theme-menu{ box-shadow:5px 5px 0 0 #000; }
@keyframes menuIn{ from{ opacity:0; transform:translateY(-6px) scale(.98);} }
.theme-menu[hidden]{ display:none; }

.theme-menu button{
  display:flex; align-items:center; gap:12px;
  width:100%; padding:9px 10px;
  background:transparent; border:0;
  color:var(--ink); text-align:start;
  border-radius:calc(var(--radius) + 2px);
  cursor:pointer; font:inherit; font-size:13.5px;
  transition:background .14s, transform .14s;
}
.theme-menu button:hover{ background:var(--surface-2); transform:translateX(2px); }
html[dir="rtl"] .theme-menu button:hover{ transform:translateX(-2px); }
.theme-menu button[aria-selected="true"]::after{
  content:""; margin-inline-start:auto;
  width:6px; height:6px; border-radius:50%;
  background:var(--accent);
}
html[data-theme="terminal"] .theme-menu button[aria-selected="true"]::after{
  content:"*"; width:auto; height:auto; border-radius:0;
  background:none; color:var(--accent);
}

.swatch{
  display:flex; gap:0; border:1px solid var(--rule);
  border-radius:2px; overflow:hidden; flex:0 0 auto;
}
.swatch i{ width:10px; height:18px; display:block; }

/* ============================================================
   INPUT PANEL
   ============================================================ */
.panel{
  margin-bottom:32px;
  animation:pageIn .5s cubic-bezier(.2,.8,.3,1) both .1s;
}
html[data-theme="paper"] .panel,
html[data-theme="ink"] .panel{
  padding-bottom:24px;
  border-bottom:var(--border-w) solid var(--rule);
}
html[data-theme="terminal"] .panel,
html[data-theme="brutalist"] .panel,
html[data-theme="nord"] .panel,
html[data-theme="dracula"] .panel,
html[data-theme="catppuccin"] .panel,
html[data-theme="solarized"] .panel{
  background:var(--surface);
  border:var(--border-w) solid var(--rule);
  border-radius:var(--radius);
  padding:18px;
  box-shadow:var(--shadow);
}

label{
  display:block; font-size:11px; font-weight:600;
  color:var(--muted); letter-spacing:.09em;
  text-transform:uppercase; margin-bottom:10px;
}
html[lang="fa"] label{ text-transform:none; letter-spacing:0; font-size:12px; }
html[data-theme="terminal"] label::before{ content:"> "; color:var(--accent); }

.row{ display:flex; gap:10px; }

input[type=url]{
  flex:1; min-width:0;
  background:var(--surface);
  border:var(--border-w) solid var(--rule);
  border-radius:var(--btn-radius);
  color:var(--ink);
  padding:13px 14px 13px 42px;
  font:inherit; font-size:14px;
  font-family:var(--font-mono);
  outline:none;
  transition:border-color .18s, background .18s, box-shadow .18s;
  width:100%;
}
html[data-theme="paper"] input[type=url],
html[data-theme="ink"] input[type=url]{ background:transparent; }
input[type=url]::placeholder{ color:color-mix(in srgb, var(--muted) 70%, transparent); }
input[type=url]:focus{ border-color:var(--accent); }
input[type=url]:focus-visible{
  outline:2px solid var(--accent); outline-offset:2px;
}

.input-wrap{ position:relative; flex:1; min-width:0; }
.input-wrap .in-icon{
  position:absolute; inset-inline-start:14px; top:50%;
  transform:translateY(-50%);
  width:18px; height:18px; color:var(--muted);
  pointer-events:none;
  transition:color .18s;
}
input[type=url]:focus + .in-icon{ color:var(--accent); }

/* ============================================================
   BUTTONS
   ============================================================ */
button, .btn{
  font:inherit; font-size:14px; cursor:pointer;
  border-radius:var(--btn-radius);
  padding:13px 20px;
  border:var(--border-w) solid transparent;
  transition:background .18s, border-color .18s, color .18s,
             transform .12s, box-shadow .18s, filter .18s;
  white-space:nowrap; text-decoration:none;
  display:inline-flex; align-items:center; justify-content:center; gap:8px;
  -webkit-tap-highlight-color:transparent;
  position:relative; overflow:hidden;
}
.btn svg{ width:15px; height:15px; display:block; flex:0 0 auto; }

.primary{
  background:var(--accent); color:var(--accent-fg);
  border-color:var(--accent); font-weight:600; letter-spacing:.01em;
}
.primary:hover{ filter:brightness(.94); transform:translateY(-1px); }
.primary:active{ transform:translateY(1px) scale(.985); }
.primary:disabled{ opacity:.55; cursor:default; transform:none; filter:none; }

html[data-theme="brutalist"] .primary{
  border-color:var(--rule); box-shadow:4px 4px 0 0 var(--rule);
}
html[data-theme="brutalist"] .primary:hover{
  filter:none; transform:translate(-1px,-1px);
  box-shadow:5px 5px 0 0 var(--rule);
}
html[data-theme="brutalist"] .primary:active{
  transform:translate(3px,3px); box-shadow:1px 1px 0 0 var(--rule);
}
html[data-theme="brutalist"] .primary:disabled{ box-shadow:4px 4px 0 0 var(--rule); }

.primary.loading{ gap:10px; }
.primary.loading::before{
  content:""; width:13px; height:13px; border-radius:50%;
  border:2px solid color-mix(in srgb, currentColor 30%, transparent);
  border-top-color:currentColor;
  animation:spin .65s linear infinite;
}
html[data-theme="terminal"] .primary.loading::before{ border-radius:0; }
@keyframes spin{ to{ transform:rotate(360deg); } }

.btn{
  background:transparent;
  border-color:var(--rule);
  color:var(--ink);
  padding:9px 14px; font-size:13px;
}
.btn:hover{ border-color:var(--ink); background:var(--surface-2); transform:translateY(-1px); }
.btn:active{ transform:translateY(1px) scale(.98); }
html[data-theme="brutalist"] .btn{ box-shadow:3px 3px 0 0 var(--rule); }
html[data-theme="brutalist"] .btn:hover{
  transform:translate(-1px,-1px); box-shadow:4px 4px 0 0 var(--rule);
}
html[data-theme="brutalist"] .btn:active{
  transform:translate(2px,2px); box-shadow:1px 1px 0 0 var(--rule);
}
.btn.ghost{ border-color:transparent; color:var(--muted); }
.btn.ghost:hover{ color:var(--ink); border-color:var(--rule); background:transparent; }

.hint{
  margin:12px 0 0; font-size:13px; color:var(--err);
  font-family:var(--font-mono);
  animation:hintIn .25s ease both;
}
@keyframes hintIn{ from{ opacity:0; transform:translateY(-4px);} }
.hint:empty{ display:none; }

/* ============================================================
   LIST HEAD
   ============================================================ */
.list-head{
  display:flex; align-items:baseline; justify-content:space-between;
  gap:16px; margin-bottom:4px;
}
.list-head h2{
  font-family:var(--font-head); font-size:13px; font-weight:700;
  letter-spacing:.12em; text-transform:uppercase;
  color:var(--ink-soft); margin:0;
}
html[lang="fa"] .list-head h2{ text-transform:none; letter-spacing:0; font-size:13.5px; }
html[data-theme="terminal"] .list-head h2{
  font-family:var(--font-mono); color:var(--accent);
}
html[data-theme="terminal"] .list-head h2::before{ content:"## "; }
html[data-theme="brutalist"] .list-head h2{ letter-spacing:-.02em; font-size:15px; }

.list{ display:flex; flex-direction:column; }

/* ============================================================
   CARD
   ============================================================ */
.card{
  animation:cardIn .45s cubic-bezier(.2,.8,.3,1) both;
  animation-delay:calc(var(--i,0) * 40ms);
  transition:border-color .2s, background .3s, box-shadow .3s;
}

html[data-theme="paper"] .card,
html[data-theme="ink"] .card{
  padding:20px 0; border-top:var(--border-w) solid var(--rule);
}
html[data-theme="paper"] .card:hover,
html[data-theme="ink"] .card:hover{ border-top-color:var(--rule-strong); }

html[data-theme="terminal"] .card,
html[data-theme="brutalist"] .card,
html[data-theme="nord"] .card,
html[data-theme="dracula"] .card,
html[data-theme="catppuccin"] .card,
html[data-theme="solarized"] .card{
  background:var(--surface);
  border:var(--border-w) solid var(--rule);
  border-radius:var(--radius);
  padding:16px; margin-bottom:12px;
  box-shadow:var(--shadow);
}
html[data-theme="terminal"] .card:hover{ border-color:var(--accent); }
html[data-theme="nord"] .card:hover,
html[data-theme="dracula"] .card:hover,
html[data-theme="catppuccin"] .card:hover,
html[data-theme="solarized"] .card:hover{ border-color:var(--rule-strong); }

@keyframes cardIn{ from{ opacity:0; transform:translateY(10px);} }

.card.just-done{ animation:doneFlash 1s ease; }
@keyframes doneFlash{
  0%{ background:color-mix(in srgb, var(--ok) 22%, transparent); }
  100%{ background:transparent; }
}
html[data-theme="brutalist"] .card.just-done{ animation:doneFlashB 1s ease; }
@keyframes doneFlashB{
  0%,100%{ box-shadow:5px 5px 0 0 var(--rule); }
  40%{ box-shadow:5px 5px 0 0 var(--ok); }
}

.card-top{
  display:flex; align-items:flex-start; justify-content:space-between;
  gap:16px; margin-bottom:12px;
}
.meta{ min-width:0; flex:1; display:flex; gap:10px; align-items:flex-start; }

.file-icon{
  flex:0 0 auto; width:32px; height:32px;
  display:grid; place-items:center;
  border-radius:calc(var(--radius) - 4px);
  background:var(--surface-2);
  color:var(--muted);
  transition:background .25s, color .25s;
}
.file-icon svg{ width:16px; height:16px; }
.card:has(.badge.ok) .file-icon{ color:var(--ok); }
.card:has(.badge.err) .file-icon{ color:var(--err); }

.name{
  font-size:15px; font-weight:600;
  overflow:hidden; text-overflow:ellipsis; white-space:nowrap;
  line-height:1.3;
}
html[data-theme="terminal"] .name{
  font-family:var(--font-mono); font-weight:500; font-size:14px;
}
html[data-theme="terminal"] .name::before{ content:"$ "; color:var(--muted); }
html[lang="fa"] .name{ font-size:14.5px; }

.sub{
  font-size:12px; color:var(--muted); margin-top:4px;
  overflow:hidden; text-overflow:ellipsis; white-space:nowrap;
  font-family:var(--font-mono);
  font-variant-numeric:tabular-nums; letter-spacing:.01em;
}

/* ============================================================
   BADGE
   ============================================================ */
.badge{
  font-size:11px; font-weight:700;
  letter-spacing:.1em; text-transform:uppercase;
  white-space:nowrap; flex:0 0 auto; padding:4px 0;
  color:var(--muted); transition:color .2s;
  display:inline-flex; align-items:center; gap:6px;
}
.badge svg{ width:12px; height:12px; }
html[lang="fa"] .badge{ text-transform:none; letter-spacing:0; font-size:12px; }
.badge.busy{ color:var(--warn); }
.badge.ok{ color:var(--ok); animation:badgePop .4s cubic-bezier(.2,.9,.3,1.5); }
.badge.err{ color:var(--err); }
@keyframes badgePop{ 0%{ transform:scale(.8); } 60%{ transform:scale(1.08);} 100%{ transform:scale(1);} }

.badge.busy::after{
  content:""; display:inline-block; width:5px; height:5px;
  border-radius:50%; background:currentColor;
  animation:dotPulse 1.4s ease-in-out infinite;
}
html[data-theme="terminal"] .badge.busy::after{ content:none; }
html[data-theme="terminal"] .badge.busy{ animation:dotPulse 1.4s ease-in-out infinite; }
html[data-theme="terminal"] .badge::before{ content:"["; opacity:.5; }
html[data-theme="terminal"] .badge::after{ content:"]"; opacity:.5; }
html[data-theme="terminal"] .badge.busy::after{ content:"]"; animation:none; }

html[data-theme="brutalist"] .badge{
  border:1px solid var(--rule); padding:4px 8px;
  background:var(--surface); font-size:10px; letter-spacing:.08em;
}
html[data-theme="brutalist"] .badge.ok{ background:var(--ok); color:#fff; border-color:var(--rule); }
html[data-theme="brutalist"] .badge.busy{ background:var(--warn); color:#000; border-color:var(--rule); }
html[data-theme="brutalist"] .badge.err{ background:var(--err); color:#fff; border-color:var(--rule); }
html[data-theme="brutalist"] .badge.busy::after{ content:none; }

/* ============================================================
   PROGRESS
   ============================================================ */
.bar{
  height:3px; background:var(--rule); overflow:hidden;
  position:relative; border-radius:0;
}
html[data-theme="nord"] .bar,
html[data-theme="dracula"] .bar,
html[data-theme="catppuccin"] .bar,
html[data-theme="solarized"] .bar{ border-radius:99px; height:4px; }
html[data-theme="brutalist"] .bar{ height:12px; border:1px solid var(--rule); }

.bar i{
  display:block; height:100%; width:0;
  background:var(--accent);
  transition:width .55s cubic-bezier(.2,.8,.3,1);
  position:relative;
}
html[data-theme="brutalist"] .bar i{
  background:repeating-linear-gradient(45deg,#000 0 6px,transparent 6px 12px), var(--accent);
}

.card:has(.badge.busy) .bar i{
  animation:indeterminate 1.7s cubic-bezier(.4,.1,.3,1) infinite;
}
@keyframes indeterminate{
  0%{ margin-inline-start:-40%; width:40%; }
  50%{ margin-inline-start:20%; width:60%; }
  100%{ margin-inline-start:100%; width:40%; }
}

/* ============================================================
   ACTIONS
   ============================================================ */
.actions{
  display:flex; gap:8px; flex-wrap:wrap;
  margin-top:14px; align-items:center;
  animation:fadeIn .25s ease both;
}
@keyframes fadeIn{ from{ opacity:0; transform:translateY(3px);} }
.small{ font-size:12px; }
.muted{ color:var(--muted); }

/* ============================================================
   VIDEO
   ============================================================ */
.player{
  width:100%; margin-top:14px;
  border-radius:var(--radius); background:#000;
  border:var(--border-w) solid var(--rule);
  display:block; animation:playerIn .35s cubic-bezier(.2,.8,.3,1) both;
}
html[data-theme="brutalist"] .player{ box-shadow:5px 5px 0 0 var(--rule); }
@keyframes playerIn{ from{ opacity:0; transform:scale(.97);} }
.player[hidden]{ display:none; }

/* ============================================================
   EMPTY
   ============================================================ */
.empty{
  text-align:center; color:var(--muted); font-size:14px;
  padding:56px 20px; font-family:var(--font-mono);
  border-top:var(--border-w) solid var(--rule);
  animation:fadeIn .5s ease both;
  display:flex; flex-direction:column; align-items:center; gap:14px;
}
.empty svg{ width:32px; height:32px; opacity:.4; }
html[data-theme="paper"] .empty::before,
html[data-theme="ink"] .empty::before{ content:"— "; }
html[data-theme="terminal"] .empty::after{
  content:"_"; color:var(--accent);
  animation:blink 1s step-end infinite;
}
@keyframes blink{ 50%{ opacity:0; } }

/* ============================================================
   TOASTS
   ============================================================ */
.toasts{
  position:fixed; inset-inline:0; bottom:24px; z-index:100;
  display:flex; flex-direction:column; align-items:center; gap:8px;
  pointer-events:none; padding-inline:16px;
}
.toast{
  pointer-events:auto; background:var(--surface);
  border:var(--border-w) solid var(--rule);
  color:var(--ink); padding:11px 16px;
  border-radius:var(--radius); font-size:13.5px;
  font-family:var(--font-mono);
  box-shadow:var(--shadow);
  transform:translateY(20px); opacity:0;
  transition:transform .35s cubic-bezier(.2,.9,.3,1.3), opacity .25s;
  max-width:90vw;
  display:flex; align-items:center; gap:10px;
}
.toast svg{ width:15px; height:15px; flex:0 0 auto; }
html[data-theme="brutalist"] .toast{ box-shadow:5px 5px 0 0 var(--rule); }
.toast.show{ transform:translateY(0); opacity:1; }
.toast.ok{ border-color:var(--ok); color:var(--ok); }
.toast.err{ border-color:var(--err); color:var(--err); }

/* ============================================================
   TELEGRAM FLOATING BUTTON
   ============================================================ */
.tg-btn{
  position:fixed; inset-inline-end:22px; bottom:22px; z-index:90;
  width:52px; height:52px; border-radius:50%;
  background:#229ed9; color:#fff;
  display:grid; place-items:center;
  text-decoration:none; cursor:pointer;
  border:0;
  box-shadow:0 12px 30px -10px rgba(34,158,217,.7);
  transition:transform .25s cubic-bezier(.2,.9,.3,1.5), box-shadow .25s, filter .2s;
  animation:tgIn .6s cubic-bezier(.2,.9,.3,1.6) both .4s;
}
@keyframes tgIn{
  from{ transform:scale(0) rotate(-40deg); opacity:0; }
}
.tg-btn:hover{
  transform:translateY(-3px) scale(1.06);
  box-shadow:0 18px 38px -12px rgba(34,158,217,.85);
  filter:brightness(1.05);
}
.tg-btn:active{ transform:scale(.95); }
.tg-btn svg{ width:24px; height:24px; display:block; }

/* pulsing ring */
.tg-btn::before{
  content:""; position:absolute; inset:-4px;
  border-radius:50%;
  border:2px solid #229ed9;
  opacity:0; animation:tgPulse 2.4s ease-out infinite 1.2s;
  pointer-events:none;
}
@keyframes tgPulse{
  0%{ transform:scale(.9); opacity:.6; }
  100%{ transform:scale(1.5); opacity:0; }
}

/* tooltip */
.tg-btn::after{
  content:attr(data-tip);
  position:absolute; inset-inline-end:calc(100% + 12px);
  top:50%; transform:translateY(-50%) translateX(6px);
  background:var(--surface); color:var(--ink);
  border:var(--border-w) solid var(--rule);
  padding:7px 12px; border-radius:var(--radius);
  font-size:12.5px; white-space:nowrap;
  opacity:0; pointer-events:none;
  transition:opacity .2s, transform .2s;
  box-shadow:var(--shadow);
  font-family:var(--font-body);
}
.tg-btn:hover::after{
  opacity:1;
  transform:translateY(-50%) translateX(0);
}

/* ============================================================
   RTL
   ============================================================ */
html[dir="rtl"] .row{ flex-direction:row-reverse; }
html[dir="rtl"] input[type=url]{ text-align:right; }
html[dir="rtl"] .bar{ direction:ltr; }
html[dir="rtl"] .tg-btn::after{
  inset-inline-end:auto; inset-inline-start:calc(100% + 12px);
  transform:translateY(-50%) translateX(-6px);
}
html[dir="rtl"] .tg-btn:hover::after{ transform:translateY(-50%) translateX(0); }

/* ============================================================
   REDUCED MOTION
   ============================================================ */
@media (prefers-reduced-motion: reduce){
  *, *::before, *::after{
    animation-duration:.01ms !important;
    animation-iteration-count:1 !important;
    transition-duration:.01ms !important;
  }
}

/* ============================================================
   RESPONSIVE
   ============================================================ */
@media (max-width:600px){
  .wrap{ padding:32px 16px 108px; }
  .row{ flex-direction:column; }
  html[dir="rtl"] .row{ flex-direction:column; }
  .primary{ width:100%; }
  header{ margin-bottom:26px; }
  .controls{ width:100%; justify-content:flex-end; }
  h1{ font-size:21px; }
  .tg-btn{ inset-inline-end:16px; bottom:16px; width:48px; height:48px; }
  .tg-btn::after{ display:none; }
}
</style>
</head>
<body>

<main class="wrap">
  <header>
    <div class="brand">
      <span class="logo" aria-hidden="true">
        <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.2"
             stroke-linecap="round" stroke-linejoin="round">
          <path d="M12 3v12"/>
          <path d="M7 10l5 5 5-5"/>
          <path d="M5 21h14"/>
        </svg>
      </span>
      <div>
        <h1 data-i18n="title">Downloader</h1>
        <div class="tag" data-i18n="tagline">stream &amp; save remote media</div>
      </div>
    </div>

    <div class="controls">
      <button id="lang" class="tool" type="button" title="Language">FA</button>

      <div class="theme-wrap">
        <button id="themeBtn" class="tool square" type="button"
                aria-haspopup="true" aria-expanded="false" title="Theme">
          <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
               stroke-linecap="round" stroke-linejoin="round">
            <path d="M12 2.69l5.66 5.66a8 8 0 1 1-11.31 0z"/>
          </svg>
        </button>
        <div id="themeMenu" class="theme-menu" role="menu" hidden></div>
      </div>

      <div class="status"><span class="dot" id="dot"></span><span id="serverText">checking…</span></div>
    </div>
  </header>

  <section class="panel">
    <label for="url" data-i18n="urlLabel">Video or file URL</label>
    <div class="row">
      <div class="input-wrap">
        <input id="url" type="url" autocomplete="off" spellcheck="false"
               data-i18n-ph="placeholder" placeholder="https://cdn.example.com/video.mp4">
        <svg class="in-icon" viewBox="0 0 24 24" fill="none" stroke="currentColor"
             stroke-width="2" stroke-linecap="round" stroke-linejoin="round" aria-hidden="true">
          <path d="M10 13a5 5 0 0 0 7.54.54l3-3a5 5 0 0 0-7.07-7.07l-1.72 1.71"/>
          <path d="M14 11a5 5 0 0 0-7.54-.54l-3 3a5 5 0 0 0 7.07 7.07l1.71-1.71"/>
        </svg>
      </div>
      <button id="go" class="primary" data-i18n="download">
        <svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.2"
             stroke-linecap="round" stroke-linejoin="round">
          <path d="M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4"/>
          <polyline points="7 10 12 15 17 10"/>
          <line x1="12" y1="15" x2="12" y2="3"/>
        </svg>
        <span data-i18n="download">Download</span>
      </button>
    </div>
    <p class="hint" id="hint"></p>
  </section>

  <div class="list-head">
    <h2 data-i18n="downloads">Downloads</h2>
    <button id="clear" class="btn ghost" data-i18n="clearAll">Clear all</button>
  </div>
  <div id="list" class="list"></div>
</main>

<!-- Telegram contact button -->
<a class="tg-btn" href="https://t.me/Andy_Br0wn" target="_blank" rel="noopener noreferrer"
   data-tip="Contact on Telegram" aria-label="Contact on Telegram">
  <svg viewBox="0 0 24 24" fill="currentColor" aria-hidden="true">
    <path d="M11.944 0A12 12 0 0 0 0 12a12 12 0 0 0 12 12 12 12 0 0 0 12-12A12 12 0 0 0 12 0a12 12 0 0 0-.056 0zm4.962 7.224c.1-.002.321.023.465.14a.506.506 0 0 1 .171.325c.016.093.036.306.02.472-.18 1.898-.962 6.502-1.36 8.627-.168.9-.499 1.201-.82 1.23-.696.065-1.225-.46-1.9-.902-1.056-.693-1.653-1.124-2.678-1.8-1.185-.78-.417-1.21.258-1.91.177-.184 3.247-2.977 3.307-3.23.007-.032.014-.15-.056-.212s-.174-.041-.249-.024c-.106.024-1.793 1.14-5.061 3.345-.48.33-.913.49-1.302.48-.428-.008-1.252-.241-1.865-.44-.752-.245-1.349-.374-1.297-.789.027-.216.325-.437.893-.663 3.498-1.524 5.83-2.529 6.998-3.014 3.332-1.386 4.025-1.627 4.476-1.635z"/>
  </svg>
</a>

<div class="toasts" id="toasts" aria-live="polite"></div>

<script>
/* ============================================================
   THEMES
   ============================================================ */
const THEMES = [
  { id:'nord',       name:'Nord',            bg:'#2e3440', ink:'#eceff4', accent:'#88c0d0' },
  { id:'dracula',    name:'Dracula',         bg:'#282a36', ink:'#f8f8f2', accent:'#bd93f9' },
  { id:'catppuccin', name:'Catppuccin Mocha', bg:'#1e1e2e', ink:'#cdd6f4', accent:'#cba6f7' },
  { id:'paper',      name:'Paper',           bg:'#f4f1e9', ink:'#1c1a17', accent:'#a83a2c' },
  { id:'ink',        name:'Ink',             bg:'#141310', ink:'#eae5d9', accent:'#e0b558' },
  { id:'solarized',  name:'Solarized Light',  bg:'#fdf6e3', ink:'#073642', accent:'#268bd2' },
  { id:'terminal',   name:'Terminal',        bg:'#06080a', ink:'#8effb0', accent:'#8effb0' },
  { id:'brutalist',  name:'Brutalist',        bg:'#eeece7', ink:'#000000', accent:'#ffdd00' },
];

/* ============================================================
   i18n
   ============================================================ */
const I18N = {
  en:{
    title:'Downloader', tagline:'stream & save remote media',
    urlLabel:'Video or file URL', placeholder:'https://cdn.example.com/video.mp4',
    download:'Download', starting:'Starting…',
    downloads:'Downloads', clearAll:'Clear all',
    empty:'No downloads yet. Paste a link above to get started.',
    play:'Play', save:'Save', copy:'Copy link', copied:'Copied', remove:'Remove',
    working:'working…',
    ready:'Ready', failed:'Failed', queued:'Queued', downloading:'Downloading',
    online:'online', offline:'offline', checking:'checking…',
    errorStart:'download did not start', errorGeneric:'Error',
    toastStarted:'Download started', toastCleared:'Cleared', toastRemoved:'Removed',
    theme:'Theme', contact:'Contact on Telegram'
  },
  fa:{
    title:'دانلودر', tagline:'پخش و ذخیرهٔ رسانه‌های آنلاین',
    urlLabel:'نشانی ویدیو یا فایل', placeholder:'https://cdn.example.com/video.mp4',
    download:'دانلود', starting:'در حال شروع…',
    downloads:'دانلودها', clearAll:'پاک کردن همه',
    empty:'هنوز دانلودی نیست. یک لینک بالا بچسبانید.',
    play:'پخش', save:'ذخیره', copy:'کپی لینک', copied:'کپی شد', remove:'حذف',
    working:'در حال انجام…',
    ready:'آماده', failed:'خطا', queued:'در انتظار', downloading:'در حال دانلود',
    online:'آنلاین', offline:'آفلاین', checking:'بررسی…',
    errorStart:'دانلود شروع نشد', errorGeneric:'خطا',
    toastStarted:'دانلود شروع شد', toastCleared:'پاک شد', toastRemoved:'حذف شد',
    theme:'پوسته', contact:'تماس در تلگرام'
  }
};

let lang = document.documentElement.lang === 'fa' ? 'fa' : 'en';
const t = k => (I18N[lang] && I18N[lang][k]) ?? I18N.en[k] ?? k;

/* ============================================================
   Icons (inline SVG strings for dynamic rendering)
   ============================================================ */
const ICON = {
  file: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"/><polyline points="14 2 14 8 20 8"/></svg>',
  video: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><polygon points="23 7 16 12 23 17 23 7"/><rect x="1" y="5" width="15" height="14" rx="2" ry="2"/></svg>',
  play: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><polygon points="5 3 19 12 5 21 5 3"/></svg>',
  save: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4"/><polyline points="7 10 12 15 17 10"/><line x1="12" y1="15" x2="12" y2="3"/></svg>',
  copy: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><rect x="9" y="9" width="13" height="13" rx="2" ry="2"/><path d="M5 15H4a2 2 0 0 1-2-2V4a2 2 0 0 1 2-2h9a2 2 0 0 1 2 2v1"/></svg>',
  trash: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><polyline points="3 6 5 6 21 6"/><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"/></svg>',
  check: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.6" stroke-linecap="round" stroke-linejoin="round"><polyline points="20 6 9 17 4 12"/></svg>',
  alert: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="10"/><line x1="12" y1="8" x2="12" y2="12"/><line x1="12" y1="16" x2="12.01" y2="16"/></svg>',
  inbox: '<svg viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.8" stroke-linecap="round" stroke-linejoin="round"><polyline points="22 12 16 12 14 15 10 15 8 12 2 12"/><path d="M5.45 5.11 2 12v6a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2v-6l-3.45-6.89A2 2 0 0 0 16.76 4H7.24a2 2 0 0 0-1.79 1.11z"/></svg>',
};

/* ============================================================
   DOM refs
   ============================================================ */
const $ = (s, r = document) => r.querySelector(s);
const listEl = $('#list'), urlEl = $('#url'), goEl = $('#go'), hintEl = $('#hint');
const toastsEl = $('#toasts');
const themeBtn = $('#themeBtn'), themeMenu = $('#themeMenu');
const KEY = 'dl.items.v2';

let items = load();
function load(){ try { return JSON.parse(localStorage.getItem(KEY)) || []; } catch { return []; } }
function save(){ try { localStorage.setItem(KEY, JSON.stringify(items)); } catch {} }

/* ============================================================
   Toasts
   ============================================================ */
function toast(msg, type = ''){
  const el = document.createElement('div');
  el.className = 'toast ' + type;
  el.innerHTML = (type === 'ok' ? ICON.check : type === 'err' ? ICON.alert : '') +
                 '<span></span>';
  el.querySelector('span').textContent = msg;
  toastsEl.appendChild(el);
  requestAnimationFrame(() => el.classList.add('show'));
  setTimeout(() => {
    el.classList.remove('show');
    el.addEventListener('transitionend', () => el.remove(), { once:true });
  }, 2200);
}

/* ============================================================
   API
   ============================================================ */
function unwrap(text){
  let j;
  try { j = JSON.parse(text); } catch { return null; }
  if (j && typeof j === 'object' && 'data' in j){
    if (j.status === false) return null;
    let d = j.data;
    if (typeof d === 'string'){ try { return JSON.parse(d); } catch { return null; } }
    return d;
  }
  return j;
}

function fromApi(d, fallbackUrl){
  return {
    id: d.file_id,
    name: d.file_name || nameFromUrl(fallbackUrl || d.file_url || ''),
    url: d.file_url || fallbackUrl || '',
    size: Number(d.file_size) || 0,
    downloaded: Number(d.file_current_dl_size) || 0,
    status: d.file_dl_status || 'DOWNLOADING',
    at: Number(d.file_creation_date) || Date.now()
  };
}

function mergeApi(it, d){
  if (d.file_dl_status) it.status = d.file_dl_status;
  if (d.file_current_dl_size != null) it.downloaded = Number(d.file_current_dl_size) || 0;
  if (d.file_size) it.size = Number(d.file_size) || 0;
  if (d.file_name) it.name = d.file_name;
  if (d.file_url) it.url = d.file_url;
}

/* ============================================================
   Helpers
   ============================================================ */
function fmtBytes(n){
  n = Number(n);
  if (!isFinite(n) || n <= 0) return '';
  const u = ['B','KB','MB','GB','TB']; let i = 0;
  while (n >= 1024 && i < u.length - 1){ n /= 1024; i++; }
  return n.toFixed(i && n < 10 ? 1 : 0) + ' ' + u[i];
}

const up = s => String(s ?? '').toUpperCase();
const isDone = s => ['FINISHED','DONE','COMPLETED','SUCCESS'].includes(up(s));
const isFail = s => ['FAILED','ERROR','CANCELED','CANCELLED'].includes(up(s));

function statusKey(s){
  if (isDone(s)) return 'ready';
  if (isFail(s)) return 'failed';
  if (!s) return 'queued';
  if (up(s) === 'DOWNLOADING') return 'downloading';
  return null;
}
function label(s){
  const k = statusKey(s);
  return k ? t(k) : (up(s)[0] + up(s).slice(1).toLowerCase());
}

function nameFromUrl(u){
  try { return decodeURIComponent(new URL(u).pathname.split('/').pop() || 'file'); }
  catch { return 'file'; }
}

function fileIcon(name, url){
  const ext = (name || url || '').split('.').pop().toLowerCase();
  if (['mp4','mkv','webm','mov','avi','m4v'].includes(ext)) return ICON.video;
  return ICON.file;
}

/* ============================================================
   Render
   ============================================================ */
const nodes = new Map();

function render(){
  if (!items.length){
    listEl.innerHTML = `<div class="empty">${'$'}{ICON.inbox}<span>${'$'}{t('empty')}</span></div>`;
    nodes.clear();
    return;
  }
  listEl.querySelector('.empty')?.remove();
  const seen = new Set();
  let i = 0;
  for (const it of items){
    seen.add(it.id);
    let n = nodes.get(it.id);
    if (!n){ n = mount(it, i); nodes.set(it.id, n); }
    update(n, it);
    i++;
  }
  for (const [id, n] of nodes) if (!seen.has(id)){ n.el.remove(); nodes.delete(id); }
  items.forEach(it => listEl.appendChild(nodes.get(it.id).el));
}

function mount(it, index){
  const el = document.createElement('article');
  el.className = 'card';
  el.dataset.id = it.id;
  el.style.setProperty('--i', index);
  el.innerHTML = `
    <div class="card-top">
      <div class="meta">
        <span class="file-icon">${'$'}{fileIcon(it.name, it.url)}</span>
        <div style="min-width:0;flex:1">
          <div class="name"></div>
          <div class="sub"></div>
        </div>
      </div>
      <span class="badge"></span>
    </div>
    <div class="bar"><i></i></div>
    <div class="actions"></div>
    <video class="player" controls preload="metadata" playsinline hidden></video>`;
  const n = {
    el,
    name: el.querySelector('.name'),
    sub: el.querySelector('.sub'),
    badge: el.querySelector('.badge'),
    fill: el.querySelector('.bar i'),
    actions: el.querySelector('.actions'),
    video: el.querySelector('.player'),
    lastStatus: it.status
  };
  n.video.src = '/stream/' + encodeURIComponent(it.id);
  return n;
}

function update(n, it){
  const done = isDone(it.status), fail = isFail(it.status);
  const wasActive = !isDone(n.lastStatus) && !isFail(n.lastStatus);

  if (wasActive && done){
    n.el.classList.remove('just-done');
    void n.el.offsetWidth;
    n.el.classList.add('just-done');
    setTimeout(() => n.el.classList.remove('just-done'), 1100);
    toast(t('ready') + ' · ' + (it.name || ''), 'ok');
  }
  n.lastStatus = it.status;

  n.name.textContent = it.name || 'file';
  n.name.title = it.url || it.id;
  n.sub.textContent = [it.id, fmtBytes(it.size)].filter(Boolean).join('  ·  ');
  n.badge.innerHTML = (done ? ICON.check : fail ? ICON.alert : '') +
                      '<span>' + label(it.status) + '</span>';
  n.badge.className = 'badge ' + (done ? 'ok' : fail ? 'err' : 'busy');

  const pct = it.size > 0 && it.downloaded > 0
    ? Math.min(100, it.downloaded / it.size * 100) : null;
  if (done)               { n.fill.style.width = '100%'; }
  else if (pct !== null)  { n.fill.style.width = pct + '%'; }
  else                    { n.fill.style.width = '40%'; }

  const sig = (done ? 'done' : fail ? 'fail' : 'busy') + ':' + lang;
  if (n.actions.dataset.sig !== sig){
    n.actions.dataset.sig = sig;
    n.actions.innerHTML =
      (done ? `<button class="btn" data-act="play">${'$'}{ICON.play}<span>${'$'}{t('play')}</span></button>` : '') +
      (done ? `<a class="btn" href="/downloads/${'$'}{encodeURIComponent(it.id)}">${'$'}{ICON.save}<span>${'$'}{t('save')}</span></a>` : '') +
      (!done && !fail ? `<span class="muted small">${'$'}{t('working')}</span>` : '') +
      `<button class="btn ghost" data-act="copy">${'$'}{ICON.copy}<span>${'$'}{t('copy')}</span></button>` +
      `<button class="btn ghost" data-act="del">${'$'}{ICON.trash}<span>${'$'}{t('remove')}</span></button>`;
  }
}

/* ============================================================
   Actions
   ============================================================ */
listEl.addEventListener('click', async e => {
  const btn = e.target.closest('[data-act]');
  if (!btn) return;
  const card = btn.closest('.card');
  const id = card.dataset.id;
  const act = btn.dataset.act;

  if (act === 'play'){
    const v = card.querySelector('video');
    v.hidden = !v.hidden;
    if (!v.hidden) v.play().catch(() => {});
  } else if (act === 'copy'){
    try {
      await navigator.clipboard.writeText(`${'$'}{location.origin}/downloads/${'$'}{id}`);
      const span = btn.querySelector('span');
      const old = span.textContent;
      span.textContent = t('copied');
      toast(t('copied'), 'ok');
      setTimeout(() => span.textContent = old, 1200);
    } catch {}
  } else if (act === 'del'){
    items = items.filter(x => x.id !== id);
    save(); render();
    toast(t('toastRemoved'));
  }
});

async function start(){
  const url = urlEl.value.trim();
  if (!url) return;
  goEl.disabled = true;
  goEl.classList.add('loading');
  const span = goEl.querySelector('span');
  const oldLabel = span ? span.textContent : goEl.textContent;
  if (span) span.textContent = t('starting'); else goEl.textContent = t('starting');
  hintEl.textContent = '';
  try {
    const res = await fetch('/dl/' + encodeURIComponent(url));
    const d = unwrap(await res.text());
    if (!res.ok || !d?.file_id) throw new Error(t('errorStart'));
    items.unshift(fromApi(d, url));
    save(); render();
    urlEl.value = '';
    toast(t('toastStarted'), 'ok');
  } catch (err){
    hintEl.textContent = t('errorGeneric') + ': ' + (err.message || err);
    toast(t('errorGeneric') + ': ' + (err.message || err), 'err');
  } finally {
    goEl.disabled = false;
    goEl.classList.remove('loading');
    if (span) span.textContent = oldLabel; else goEl.textContent = oldLabel;
  }
}

goEl.addEventListener('click', start);
urlEl.addEventListener('keydown', e => { if (e.key === 'Enter') start(); });

$('#clear').addEventListener('click', () => {
  fetch('/clear').catch(() => {});
  items = []; save(); render();
  toast(t('toastCleared'));
});

/* ============================================================
   Polling
   ============================================================ */
async function poll(){
  const active = items.filter(i => !isDone(i.status) && !isFail(i.status));
  if (!active.length) return;
  let changed = false;
  await Promise.all(active.map(async it => {
    try {
      const res = await fetch('/status/' + encodeURIComponent(it.id), { cache: 'no-store' });
      if (!res.ok) return;
      const d = unwrap(await res.text());
      if (!d || typeof d !== 'object') return;
      const before = JSON.stringify(it);
      mergeApi(it, d);
      if (JSON.stringify(it) !== before) changed = true;
    } catch {}
  }));
  if (changed){ save(); render(); }
}
setInterval(poll, 1500);

/* ============================================================
   Health
   ============================================================ */
async function ping(){
  const dot = $('#dot'), txt = $('#serverText');
  try {
    const r = await fetch('/api', { cache: 'no-store' });
    if (!r.ok) throw 0;
    dot.className = 'dot on'; txt.textContent = t('online');
  } catch {
    dot.className = 'dot off'; txt.textContent = t('offline');
  }
}
setInterval(ping, 15000);

/* ============================================================
   Theme picker
   ============================================================ */
function currentTheme(){ return document.documentElement.dataset.theme || 'nord'; }

function buildThemeMenu(){
  themeMenu.innerHTML = '';
  for (const th of THEMES){
    const btn = document.createElement('button');
    btn.type = 'button';
    btn.setAttribute('role', 'menuitemradio');
    btn.dataset.themeVal = th.id;
    btn.setAttribute('aria-selected', String(th.id === currentTheme()));
    btn.innerHTML = `
      <span class="swatch" aria-hidden="true">
        <i style="background:${'$'}{th.bg}"></i>
        <i style="background:${'$'}{th.ink}"></i>
        <i style="background:${'$'}{th.accent}"></i>
      </span>
      <span>${'$'}{th.name}</span>`;
    btn.addEventListener('click', () => { setTheme(th.id); closeThemeMenu(); });
    themeMenu.appendChild(btn);
  }
}

function setTheme(id){
  document.documentElement.dataset.theme = id;
  try { localStorage.setItem('dl.theme', id); } catch {}
  themeMenu.querySelectorAll('button').forEach(b =>
    b.setAttribute('aria-selected', String(b.dataset.themeVal === id)));
}

function openThemeMenu(){
  themeMenu.hidden = false;
  themeBtn.setAttribute('aria-expanded', 'true');
}
function closeThemeMenu(){
  themeMenu.hidden = true;
  themeBtn.setAttribute('aria-expanded', 'false');
}
themeBtn.addEventListener('click', e => {
  e.stopPropagation();
  themeMenu.hidden ? openThemeMenu() : closeThemeMenu();
});
document.addEventListener('click', e => {
  if (!themeMenu.hidden && !e.target.closest('.theme-wrap')) closeThemeMenu();
});
document.addEventListener('keydown', e => { if (e.key === 'Escape') closeThemeMenu(); });

/* ============================================================
   Language
   ============================================================ */
const langBtn = $('#lang');

function applyLang(){
  document.documentElement.lang = lang;
  document.documentElement.dir = lang === 'fa' ? 'rtl' : 'ltr';
  langBtn.textContent = lang === 'fa' ? 'EN' : 'FA';

  document.querySelectorAll('[data-i18n]').forEach(el => {
    el.textContent = t(el.dataset.i18n);
  });
  document.querySelectorAll('[data-i18n-ph]').forEach(el => {
    el.setAttribute('placeholder', t(el.dataset.i18nPh));
  });

  /* Telegram tooltip */
  const tg = document.querySelector('.tg-btn');
  if (tg) tg.setAttribute('data-tip', t('contact'));

  document.querySelectorAll('.actions').forEach(a => delete a.dataset.sig);
  document.querySelectorAll('.badge').forEach(b => b.innerHTML = '');
  render();
  ping();
}

langBtn.addEventListener('click', () => {
  lang = lang === 'fa' ? 'en' : 'fa';
  try { localStorage.setItem('dl.lang', lang); } catch {}
  applyLang();
});

/* ============================================================
   Boot
   ============================================================ */
buildThemeMenu();
applyLang();
render();
ping();
</script>
</body>
</html>
    """
}
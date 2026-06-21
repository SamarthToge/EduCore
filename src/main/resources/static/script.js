// ── DATA ──────────────────────────────────────────────────────────────
const classes = [
    { cls:'Grade 6', sec:'A', teacher:'Ms. Priya Das',    students:42, room:'101', avg:'82%' },
    { cls:'Grade 7', sec:'B', teacher:'Mr. Suresh Naik',  students:38, room:'205', avg:'78%' },
    { cls:'Grade 8', sec:'A', teacher:'Ms. Kavita Joshi', students:40, room:'304', avg:'85%' },
    { cls:'Grade 9', sec:'C', teacher:'Dr. Anita Singh',  students:35, room:'112', avg:'91%' },
    { cls:'Grade 10',sec:'A', teacher:'Mr. Rahul Gupta',  students:44, room:'402', avg:'88%' },
    { cls:'Grade 10',sec:'B', teacher:'Ms. Deepa Iyer',   students:41, room:'403', avg:'83%' },
];
const schedule = [
    { time:'8:00', slots:[
            { sub:'Mathematics', room:'R-101', c:'#4f8ef750' },
            { sub:'Science',     room:'R-205', c:'#7c3aed50' },
            { sub:'English',     room:'R-304', c:'#06d6a050' },
            { sub:'Hindi',       room:'R-112', c:'#f59e0b50' },
            { sub:'Assembly',    room:'Ground', c:'#ef444450' },
        ]},
    { time:'9:00', slots:[
            { sub:'Science',     room:'Lab-1', c:'#7c3aed50' },
            { sub:'Mathematics', room:'R-101', c:'#4f8ef750' },
            null,
            { sub:'Mathematics', room:'R-402', c:'#4f8ef750' },
            { sub:'English',     room:'R-304', c:'#06d6a050' },
        ]},
    { time:'10:00',slots:[
            { sub:'English',     room:'R-304', c:'#06d6a050' },
            null,
            { sub:'Science',     room:'Lab-2', c:'#7c3aed50' },
            { sub:'English',     room:'R-304', c:'#06d6a050' },
            { sub:'Mathematics', room:'R-101', c:'#4f8ef750' },
        ]},
    { time:'11:00',slots:[null,null,null,null,null]},
    { time:'12:00',slots:[
            { sub:'Hindi',       room:'R-112', c:'#f59e0b50' },
            { sub:'Social St.',  room:'R-201', c:'#ef444450' },
            { sub:'Mathematics', room:'R-101', c:'#4f8ef750' },
            { sub:'Science',     room:'Lab-1', c:'#7c3aed50' },
            null,
        ]},
    { time:'1:00', slots:[null,null,null,null,null]},
    { time:'2:00', slots:[
            { sub:'Computer',    room:'Lab-C', c:'#4f8ef750' },
            { sub:'English',     room:'R-304', c:'#06d6a050' },
            { sub:'Hindi',       room:'R-112', c:'#f59e0b50' },
            { sub:'Social St.',  room:'R-201', c:'#ef444450' },
            { sub:'Computer',    room:'Lab-C', c:'#4f8ef750' },
        ]},
];
const examData = [
    { name:'Arjun Sharma',  scores:[92,88,95,85,90], color:'#4f8ef7' },
    { name:'Priya Patel',   scores:[85,91,88,78,82], color:'#7c3aed' },
    { name:'Rohan Mehta',   scores:[74,80,70,88,75], color:'#06d6a0' },
    { name:'Sneha Desai',   scores:[98,95,96,92,97], color:'#f59e0b' },
    { name:'Kiran Nair',    scores:[62,70,65,58,68], color:'#ef4444' },
    { name:'Dev Joshi',     scores:[80,77,82,74,79], color:'#4f8ef7' },
];
const feeData = [
    { student:'Arjun Sharma',  class:'10A', total:45000, paid:45000, due:0,     dueDate:'2026-03-31', status:'paid' },
    { student:'Priya Patel',   class:'10B', total:45000, paid:30000, due:15000, dueDate:'2026-06-15', status:'partial' },
    { student:'Rohan Mehta',   class:'9A',  total:40000, paid:40000, due:0,     dueDate:'2026-03-31', status:'paid' },
    { student:'Sneha Desai',   class:'8C',  total:38000, paid:0,     due:38000, dueDate:'2026-05-31', status:'overdue' },
    { student:'Kiran Nair',    class:'7B',  total:35000, paid:35000, due:0,     dueDate:'2026-03-31', status:'paid' },
    { student:'Dev Joshi',     class:'9B',  total:40000, paid:20000, due:20000, dueDate:'2026-07-15', status:'partial' },
];
const libraryData = [
    { title:'Mathematics NCERT X',      author:'NCERT',         student:'Arjun Sharma',  issued:'2026-05-10', due:'2026-06-10', status:'overdue' },
    { title:'Wings of Fire',            author:'A.P.J. Kalam',  student:'Priya Patel',   issued:'2026-05-20', due:'2026-06-20', status:'active' },
    { title:'Discovery of India',       author:'Jawaharlal N.', student:'Sneha Desai',   issued:'2026-05-28', due:'2026-06-28', status:'active' },
    { title:'Physics Part I, Class XI', author:'NCERT',         student:'Rohan Mehta',   issued:'2026-04-15', due:'2026-05-15', status:'overdue' },
    { title:'English Flamingo',         author:'CBSE Board',    student:'Meera Rao',     issued:'2026-06-01', due:'2026-07-01', status:'active' },
];
const notices = [
    { icon:'📅', iconBg:'rgba(79,142,247,0.12)', iconColor:'var(--accent)', title:'Annual Sports Day', desc:'Annual Sports Day scheduled for June 20th. All students to report in house color T-shirts by 8 AM.', time:'2 hours ago' },
    { icon:'📝', iconBg:'rgba(124,58,237,0.12)', iconColor:'var(--accent2)', title:'Mid-Term Exam Schedule Released', desc:'Mid-term examinations for Grades 6–10 will commence from July 1st. Time tables available on notice board.', time:'Yesterday' },
    { icon:'🎉', iconBg:'rgba(6,214,160,0.12)',   iconColor:'var(--accent3)', title:'School Foundation Day', desc:'Celebrate 28 years of excellence! Cultural programs, prize distribution and founder\'s address at 10 AM.', time:'2 days ago' },
    { icon:'⚠️', iconBg:'rgba(245,158,11,0.12)', iconColor:'var(--accent4)', title:'Fee Payment Reminder', desc:'Last date for tuition fee payment is June 30th. Defaulters may face late fine of ₹50/day.', time:'3 days ago' },
];
const events = [
    { day:12, mon:'Jun', title:'Sports Day', meta:'8:00 AM • School Ground', bar:'#4f8ef7' },
    { day:15, mon:'Jun', title:'PTM – Grade 8 & 9', meta:'10:00 AM – 1:00 PM • Auditorium', bar:'#7c3aed' },
    { day:20, mon:'Jun', title:'Science Fair', meta:'9:00 AM • Exhibition Hall', bar:'#06d6a0' },
    { day:28, mon:'Jun', title:'Foundation Day', meta:'10:00 AM • Main Hall', bar:'#f59e0b' },
];
const notifSettings = [
    { label:'Fee payment reminders', on:true },
    { label:'Attendance alerts', on:true },
    { label:'Exam schedule updates', on:false },
    { label:'Notice board updates', on:true },
];

// ── RENDER HELPERS ──────────────────────────────────────────────────────
function gradeLabel(pct) {
    if(pct>=90) return '<span class="badge success">A+</span>';
    if(pct>=80) return '<span class="badge info">A</span>';
    if(pct>=70) return '<span class="badge purple">B+</span>';
    if(pct>=60) return '<span class="badge warning">B</span>';
    return '<span class="badge danger">C</span>';
}
function statusBadge(s) {
    const m = {paid:'success',partial:'warning',overdue:'danger',active:'success'};
    return `<span class="badge ${m[s]||'info'}">${s}</span>`;
}

// Build bar chart
function buildBarChart(id, labId, days, vals, colors) {
    const max = Math.max(...vals);
    const c = document.getElementById(id); if(!c) return;
    c.innerHTML = vals.map((v,i)=>`<div class="bar ${v===max?'hi':''}" style="height:${Math.round((v/max)*100)}%;background:${colors?colors[i]:'rgba(79,142,247,0.2)'}" title="${v}%"></div>`).join('');
    if(labId) document.getElementById(labId).innerHTML = days.map(d=>`<span>${d}</span>`).join('');
}

// Mini calendar
function buildCal() {
    const el = document.getElementById('miniCal'); if(!el) return;
    const dow = ['S','M','T','W','T','F','S'];
    const eventDays = [12,15,20,28];
    let html = dow.map(d=>`<div class="cal-dow">${d}</div>`).join('');
    // June 2026 starts on Monday (index 1)
    for(let i=0;i<1;i++) html+=`<div class="cal-day other"></div>`;
    for(let d=1;d<=30;d++) {
        const cls = d===6?'today':eventDays.includes(d)?'has-event':'';
        html+=`<div class="cal-day ${cls}">${d}</div>`;
    }
    el.innerHTML = html;
}

// Students grid
function buildStudents() {
    const el = document.getElementById('studentCards'); if(!el) return;
    el.innerHTML = students.map(s=>`
    <div class="student-card">
      <div class="student-card-top">
        <div class="student-av" style="background:${s.color}22;color:${s.color}">${s.name.split(' ').map(x=>x[0]).join('')}</div>
        <div><div class="student-name">${s.name}</div><div class="student-id">${s.id} · Class ${s.class}</div></div>
      </div>
      <div class="student-stats">
        <div class="student-stat"><div class="val" style="color:${s.color}">${s.att}</div><div class="lbl">Attendance</div></div>
        <div class="student-stat"><div class="val">${s.grade}</div><div class="lbl">Grade</div></div>
        <div class="student-stat"><div class="val" style="color:var(--accent3)">↑</div><div class="lbl">Trend</div></div>
      </div>
    </div>
  `).join('');
}

// Teachers
function buildTeachers() {
    const el = document.getElementById('teacherCards'); if(!el) return;
    el.innerHTML = teachers.map(t=>`
    <div class="teacher-card">
      <div class="teacher-av" style="background:${t.color}22;color:${t.color}">${t.init}</div>
      <div class="teacher-name">${t.name}</div>
      <div class="teacher-subject">${t.subject}</div>
      <div class="teacher-exp">Experience: ${t.exp}</div>
      <div style="margin-top:10px;display:flex;gap:6px;justify-content:center;">
        <span class="badge success">Active</span>
      </div>
    </div>
  `).join('');
}

// Classes table
function buildClasses() {
    const el = document.getElementById('classTable'); if(!el) return;
    el.innerHTML = classes.map(c=>`
    <tr>
      <td>${c.cls}</td>
      <td><span class="badge info">Sec. ${c.sec}</span></td>
      <td>${c.teacher}</td>
      <td>${c.students}</td>
      <td><span style="color:var(--text3);font-size:0.82rem;">${c.room}</span></td>
      <td><span style="color:var(--accent3);font-weight:600;">${c.avg}</span></td>
      <td style="display:flex;gap:6px;">
        <button class="btn-icon" title="View">👁</button>
        <button class="btn-icon" title="Edit">✏️</button>
      </td>
    </tr>
  `).join('');
}

// Schedule
function buildSchedule() {
    const el = document.getElementById('scheduleGrid'); if(!el) return;
    const BREAK_HOURS = ['11:00','1:00'];
    el.innerHTML = schedule.map(row=>{
        if(BREAK_HOURS.includes(row.time)) {
            return `<div class="schedule-row"><div class="schedule-time">${row.time}</div><div style="grid-column:span 5;background:var(--surface2);border:1px dashed var(--border2);border-radius:8px;display:flex;align-items:center;justify-content:center;font-size:0.72rem;color:var(--text3);min-height:36px;">${row.time==='11:00'?'☕ Break':'🍽 Lunch Break'}</div></div>`;
        }
        const cells = row.slots.map(s=>s
            ? `<div class="schedule-cell" style="background:${s.c};border-color:${s.c.slice(0,7)}66"><div class="sub">${s.sub}</div><div class="room">${s.room}</div></div>`
            : `<div class="schedule-cell empty"></div>`
        ).join('');
        return `<div class="schedule-row"><div class="schedule-time">${row.time}</div>${cells}</div>`;
    }).join('');
}

// Exams
function buildExams() {
    const el = document.getElementById('examTable'); if(!el) return;
    const subs = ['Maths','Science','English','Hindi','Social'];
    el.innerHTML = examData.map(s=>{
        const avg = Math.round(s.scores.reduce((a,b)=>a+b,0)/s.scores.length);
        return `<tr>
      <td style="display:flex;align-items:center;gap:8px;"><div style="width:28px;height:28px;border-radius:50%;background:${s.color}22;color:${s.color};display:flex;align-items:center;justify-content:center;font-size:0.65rem;font-weight:700;flex-shrink:0;">${s.name.split(' ').map(x=>x[0]).join('')}</div>${s.name}</td>
      ${s.scores.map(v=>`<td>${v}</td>`).join('')}
      <td><b>${avg}%</b></td>
      <td>${gradeLabel(avg)}</td>
    </tr>`;
    }).join('');

    // Grade distribution chart
    const gd = document.getElementById('gradeChart'); if(gd) {
        const labels=['A+','A','B+','B','C'];
        const vals=[2,2,1,1,0];
        const colors=['#06d6a0','#4f8ef7','#7c3aed','#f59e0b','#ef4444'];
        gd.innerHTML=`<div class="bar-chart">${vals.map((v,i)=>`<div class="bar" style="height:${v?Math.round(v/2*100):10}%;background:${colors[i]}55;border:1px solid ${colors[i]}88;" title="${labels[i]}: ${v}"><span style="display:block;text-align:center;font-size:0.6rem;color:${colors[i]};margin-top:4px;">${v}</span></div>`).join('')}</div><div class="bar-labels">${labels.map(l=>`<span>${l}</span>`).join('')}</div>`;
    }
    // Subject perf
    const sp = document.getElementById('subjectPerf'); if(sp) {
        const subs2=['Maths','Science','English','Hindi','Social'];
        const avgs = subs2.map((_,i)=>Math.round(examData.reduce((a,s)=>a+s.scores[i],0)/examData.length));
        const clrs=['#4f8ef7','#7c3aed','#06d6a0','#f59e0b','#ef4444'];
        sp.innerHTML=avgs.map((v,i)=>`
      <div style="margin-bottom:12px;">
        <div style="display:flex;justify-content:space-between;margin-bottom:4px;font-size:0.8rem;">
          <span>${subs2[i]}</span><span style="color:${clrs[i]};font-weight:600;">${v}%</span>
        </div>
        <div class="progress-bar"><div class="progress-fill" style="width:${v}%;background:${clrs[i]};"></div></div>
      </div>
    `).join('');
    }
}

// Attendance
function buildAttendance() {
    const el = document.getElementById('attTable'); if(!el) return;
    const attStudents = students.slice(0,6);
    const statuses = ['present','present','late','present','absent','present'];
    el.innerHTML = attStudents.map((s,i)=>{
        const st = statuses[i];
        return `<tr>
      <td>${i+1}</td>
      <td>${s.name}</td>
      <td><input type="radio" name="att${i}" ${st==='present'?'checked':''} /></td>
      <td><input type="radio" name="att${i}" ${st==='absent'?'checked':''} /></td>
      <td><input type="radio" name="att${i}" ${st==='late'?'checked':''} /></td>
      <td><input type="radio" name="att${i}" /></td>
      <td><input type="text" placeholder="—" style="width:100px;padding:4px 8px;font-size:0.78rem;" /></td>
    </tr>`;
    }).join('');

    // Circles
    const ac = document.getElementById('attCircles'); if(ac) {
        const data = [{pct:88,label:'Overall',c:'#4f8ef7'},{pct:6,label:'Absent',c:'#ef4444'},{pct:4,label:'Late',c:'#f59e0b'},{pct:2,label:'Leave',c:'#7c3aed'}];
        const r=28, circ=2*Math.PI*r;
        ac.innerHTML = data.map(d=>{
            const offset = circ-(circ*d.pct/100);
            return `<div class="att-circle">
        <svg class="circle-svg" viewBox="0 0 70 70">
          <circle class="circle-track" cx="35" cy="35" r="${r}"/>
          <circle class="circle-fill" cx="35" cy="35" r="${r}" stroke="${d.c}" stroke-dasharray="${circ}" stroke-dashoffset="${offset}"/>
        </svg>
        <div class="att-pct" style="color:${d.c}">${d.pct}%</div>
        <div class="att-sub">${d.label}</div>
      </div>`;
        }).join('');
    }
    buildBarChart('attBarChart','attBarLabels',['May 1','May 8','May 15','May 22','May 29','Jun 5'],[91,88,94,92,89,95]);
}

// Fees
function buildFees() {
    const el = document.getElementById('feeTable'); if(!el) return;
    el.innerHTML = feeData.map(f=>`
    <tr>
      <td>${f.student}</td>
      <td>${f.class}</td>
      <td>₹${f.total.toLocaleString()}</td>
      <td style="color:var(--accent3);">₹${f.paid.toLocaleString()}</td>
      <td style="color:${f.due>0?'var(--danger)':'var(--text3)'}">₹${f.due.toLocaleString()}</td>
      <td style="color:var(--text3);font-size:0.8rem;">${f.dueDate}</td>
      <td>${statusBadge(f.status)}</td>
      <td><button class="btn btn-sm btn-primary" onclick="openModal('addFeeModal')">Pay</button></td>
    </tr>
  `).join('');

    const fs = document.getElementById('feeSummary'); if(fs) {
        const total=feeData.reduce((a,f)=>a+f.total,0);
        const paid=feeData.reduce((a,f)=>a+f.paid,0);
        const due=feeData.reduce((a,f)=>a+f.due,0);
        fs.innerHTML = [
            {l:'Total Fee',v:'₹'+total.toLocaleString(),c:'var(--text)'},
            {l:'Collected',v:'₹'+paid.toLocaleString(),c:'var(--accent3)'},
            {l:'Outstanding',v:'₹'+due.toLocaleString(),c:'var(--danger)'},
            {l:'Collection Rate',v:Math.round(paid/total*100)+'%',c:'var(--accent)'},
        ].map(s=>`<div class="fee-stat"><div class="label">${s.l}</div><div class="value" style="color:${s.c}">${s.v}</div></div>`).join('');
    }
}

// Library
function buildLibrary() {
    const el = document.getElementById('libraryTable'); if(!el) return;
    el.innerHTML = libraryData.map(b=>`
    <tr>
      <td>${b.title}</td>
      <td style="color:var(--text2);font-size:0.82rem;">${b.author}</td>
      <td>${b.student}</td>
      <td style="color:var(--text3);font-size:0.8rem;">${b.issued}</td>
      <td style="color:var(--text3);font-size:0.8rem;">${b.due}</td>
      <td>${statusBadge(b.status)}</td>
    </tr>
  `).join('');
}

// Notices
function buildNotices() {
    const el = document.getElementById('noticesList'); if(!el) return;
    el.innerHTML = `<div class="card-title"><span class="dot" style="background:var(--accent)"></span> Recent Notices</div>` +
        notices.map(n=>`
      <div class="notice-item">
        <div class="notice-icon" style="background:${n.iconBg};color:${n.iconColor}">${n.icon}</div>
        <div class="notice-text">
          <div class="title">${n.title}</div>
          <div class="desc">${n.desc}</div>
          <div class="notice-time">${n.time}</div>
        </div>
      </div>
    `).join('');

    const ne = document.getElementById('noticeEvents'); if(ne) {
        ne.innerHTML = events.map(e=>`
      <div class="event-item">
        <div class="event-date"><div class="day">${e.day}</div><div class="mon">${e.mon}</div></div>
        <div class="event-bar" style="background:${e.bar}"></div>
        <div class="event-info"><div class="title">${e.title}</div><div class="meta">${e.meta}</div></div>
      </div>
    `).join('');
    }
}

// Settings notifications
function buildSettings() {
    const el = document.getElementById('notifSettings'); if(!el) return;
    el.innerHTML = notifSettings.map((n,i)=>`
    <div style="display:flex;justify-content:space-between;align-items:center;">
      <span style="font-size:0.85rem;">${n.label}</span>
      <div class="toggle-wrap" onclick="this.classList.toggle('on')" style="position:relative;width:40px;height:22px;border-radius:11px;background:${n.on?'var(--accent)':'var(--surface2)'};border:1px solid var(--border2);cursor:pointer;transition:background 0.2s;" data-on="${n.on}">
        <div style="position:absolute;top:2px;left:${n.on?'20px':'2px'};width:16px;height:16px;border-radius:50%;background:#fff;transition:left 0.2s;box-shadow:0 1px 3px rgba(0,0,0,0.3);"></div>
      </div>
    </div>
  `).join('');
    // Toggle logic
    el.querySelectorAll('.toggle-wrap').forEach(tw=>{
        tw.addEventListener('click',function(){
            const on = this.getAttribute('data-on')==='true';
            this.setAttribute('data-on', !on);
            this.style.background = !on?'var(--accent)':'var(--surface2)';
            this.querySelector('div').style.left = !on?'20px':'2px';
        });
    });
}

// Dashboard specifics
function buildDashboard() {
    // Bar chart
    buildBarChart('barChart','barLabels',['Mon','Tue','Wed','Thu','Fri','Sat'],[91,95,88,96,93,0]);

    // Recent students table
    const rs = document.getElementById('recentStudents'); if(rs) {
        const recent = [
            {n:'Arjun Sharma',c:'10-A',d:'Jun 4',s:'active'},
            {n:'Meera Rao',   c:'6-A', d:'Jun 3',s:'active'},
            {n:'Dev Joshi',   c:'9-B', d:'Jun 1',s:'active'},
            {n:'Nisha Gupta', c:'8-C', d:'May 30',s:'active'},
            {n:'Vivek Kumar', c:'7-A', d:'May 28',s:'pending'},
        ];
        rs.innerHTML = recent.map(r=>`<tr><td>${r.n}</td><td>${r.c}</td><td style="color:var(--text3);font-size:0.8rem;">${r.d}</td><td>${statusBadge(r.s)}</td></tr>`).join('');
    }

    // Upcoming events
    const ue = document.getElementById('upcomingEvents'); if(ue) {
        ue.innerHTML = events.map(e=>`
      <div class="event-item">
        <div class="event-date"><div class="day">${e.day}</div><div class="mon">${e.mon}</div></div>
        <div class="event-bar" style="background:${e.bar}"></div>
        <div class="event-info"><div class="title">${e.title}</div><div class="meta">${e.meta}</div></div>
      </div>
    `).join('');
    }
    buildCal();
}

// ── MODAL ──────────────────────────────────────────────────────────────
function openModal(id) { document.getElementById(id).classList.add('open'); }
function closeModal(id) { document.getElementById(id).classList.remove('open'); }
document.querySelectorAll('.overlay').forEach(o=>o.addEventListener('click',function(e){ if(e.target===this) this.classList.remove('open'); }));

// ── TOAST ──────────────────────────────────────────────────────────────
function showToast(msg, type='info') {
    const icons = {success:'✅',error:'❌',info:'ℹ️'};
    const tc = document.getElementById('toastContainer');
    const t = document.createElement('div');
    t.className=`toast ${type}`;
    t.innerHTML=`<span>${icons[type]}</span><span>${msg}</span>`;
    tc.appendChild(t);
    setTimeout(()=>t.remove(),3200);
}

// ── SIDEBAR TOGGLE ──────────────────────────────────────────────────────
function toggleSidebar() {
    const sb = document.getElementById('sidebar');
    const ob = document.getElementById('overlayBg');
    sb.classList.toggle('open');
    ob.classList.toggle('open');
}

// ── TAB CLICK ──────────────────────────────────────────────────────────
document.querySelectorAll('.tabs').forEach(tabGroup=>{
    tabGroup.querySelectorAll('.tab').forEach(tab=>{
        tab.addEventListener('click',function(){
            tabGroup.querySelectorAll('.tab').forEach(t=>t.classList.remove('active'));
            this.classList.add('active');
        });
    });
});

// ── INIT ──────────────────────────────────────────────────────────────
document.addEventListener('DOMContentLoaded', () => {
    const pages = {
        'page-dashboard': { title: 'Dashboard', build: buildDashboard },
        'page-students': { title: 'Students', build: buildStudents },
        'page-teachers': { title: 'Teachers', build: buildTeachers },
        'page-classes': { title: 'Classes', build: buildClasses },
        'page-schedule': { title: 'Schedule', build: buildSchedule },
        'page-exams': { title: 'Exams & Grades', build: buildExams },
        'page-attendance': { title: 'Attendance', build: buildAttendance },
        'page-fees': { title: 'Fees', build: buildFees },
        'page-library': { title: 'Library', build: buildLibrary },
        'page-notices': { title: 'Notices', build: buildNotices },
        'page-settings': { title: 'Settings', build: buildSettings },
        'page-add-user': { title: 'Add User', build: null },
        'page-profile':  { title: 'My Profile', build: null },
    };

    for (const [id, config] of Object.entries(pages)) {
        if (document.getElementById(id)) {
            if (config.build) config.build();
            if (document.getElementById('topbarTitle')) {
                document.getElementById('topbarTitle').textContent = config.title;
            }
            break;
        }
    }
});
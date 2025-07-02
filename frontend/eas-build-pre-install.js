const fs = require('fs');
const path = require('path');

console.log('🔧 [EAS PRE-INSTALL] Çalışıyor...');

const GOOGLE_SERVICES_JSON = process.env.GOOGLE_SERVICES_JSON;

if (!GOOGLE_SERVICES_JSON) {
  console.warn('⚠️ GOOGLE_SERVICES_JSON environment variable tanımlı değil.');
  process.exit(0);
}

const decoded = Buffer.from(GOOGLE_SERVICES_JSON, 'base64').toString('utf-8');
const outputPath = path.join(__dirname, 'android', 'app', 'google-services.json');

fs.mkdirSync(path.dirname(outputPath), { recursive: true });
fs.writeFileSync(outputPath, decoded);

console.log('✅ google-services.json dosyası oluşturuldu:', outputPath);

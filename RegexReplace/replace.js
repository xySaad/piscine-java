const tests = [
  "john.doe@example.com",
  "jann@example.co.org",
  "jackob@example.fr",
];
const username = "(:?)";

const pattern = new RegExp(`[^@]+${username}`, "g");
for (const test of tests) {
  const res = test.replaceAll(pattern, "*");
  console.log(res);
}

let depositInput = document.getElementById('deposit-input');
let withdrawInput = document.getElementById('withdraw-input');
const depositBtn = document.getElementById('deposit-btn')
const withdrawBtn = document.getElementById('withdraw-btn')

let newBalance;
let newWithdrawAmount;

depositBtn.addEventListener('click', function(){
  let currentDeposit = parseFloat(document.getElementById('deposit-total').innerText)
  depositAmount = parseFloat(depositInput.value)
  newBalance = currentDeposit + depositAmount; 
  document.getElementById('deposit-total').innerText = newBalance
  document.getElementById('balance-total').innerText = newBalance

  withdrawInput
})



